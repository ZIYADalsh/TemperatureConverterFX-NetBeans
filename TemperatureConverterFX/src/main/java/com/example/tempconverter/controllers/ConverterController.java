package com.example.tempconverter.controllers;

import com.example.tempconverter.util.TemperatureConverter;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller for the converter view. Handles user actions and validation.
 * The logic is straightforward:
 * 1) Read the numeric input.
 * 2) Read conversion direction from a ComboBox.
 * 3) Call the appropriate pure function from TemperatureConverter.
 * 4) Render the formatted result into a Label.
 */
public class ConverterController {

    @FXML private TextField inputField;
    @FXML private ComboBox<String> directionBox;
    @FXML private Button convertButton;
    @FXML private Label resultLabel;

    @FXML
    private void initialize() {
        // Populate conversion choices.
        directionBox.getItems().addAll("Celsius → Fahrenheit", "Fahrenheit → Celsius");
        directionBox.getSelectionModel().selectFirst();

        // Set informative placeholder and result.
        inputField.setPromptText("Enter a value like 37 or 98.6");
        resultLabel.setText("Result will appear here");
    }

    @FXML
    private void onConvert() {
        final String text = inputField.getText();
        if (text == null || text.trim().isEmpty()) {
            showError("Please enter a valid number.");
            return;
        }
        final double value;
        try {
            value = Double.parseDouble(text.trim());
        } catch (NumberFormatException ex) {
            showError("Input is not a number. Use digits like 37 or 98.6");
            return;
        }

        final String dir = directionBox.getSelectionModel().getSelectedItem();
        double out;
        String formatted;
        if ("Celsius → Fahrenheit".equals(dir)) {
            out = TemperatureConverter.celsiusToFahrenheit(value);
            formatted = String.format("%.2f °F", out);
        } else {
            out = TemperatureConverter.fahrenheitToCelsius(value);
            formatted = String.format("%.2f °C", out);
        }
        resultLabel.setText(formatted);
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
