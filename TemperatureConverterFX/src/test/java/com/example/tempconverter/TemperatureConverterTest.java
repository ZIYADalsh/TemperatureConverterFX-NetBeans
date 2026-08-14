package com.example.tempconverter;

import com.example.tempconverter.util.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 1e-9);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0), 1e-9);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37.0), 1e-9);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 1e-9);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0), 1e-9);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 1e-9);
    }
}
