package com.example.tempconverter.util;

/**
 * Pure functions for temperature conversion.
 * Each method is deterministic and side-effect free.
 */
public final class TemperatureConverter {

    private TemperatureConverter() { }

    /**
     * Converts Celsius to Fahrenheit.
     * Formula: F = C * 9/5 + 32
     * @param celsius input temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * Formula: C = (F - 32) * 5/9
     * @param fahrenheit input temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
