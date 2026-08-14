package com.example.tempconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point of the JavaFX application.
 * Loads the FXML and applies the stylesheet.
 * The GUI implements temperature conversion between Celsius and Fahrenheit.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("converter-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 640, 380);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("app-icon.png")));
        stage.setMinWidth(560);
        stage.setMinHeight(380);
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
