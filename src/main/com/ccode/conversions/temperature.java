package com.ccode.conversions;
public class temperature {
    public static double kelvinToFahrenheit(double kelvin) {
        return 1.8 * (kelvin - 273.0) + 32.0;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit + 459.67);
    }
}