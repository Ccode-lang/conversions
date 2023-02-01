package com.ccode.tests;
import com.ccode.conversions.temperature;
public class test {
    public static void main(String[] args) {
        // kelvinToFahrenheit test
        try {
            if (temperature.kelvinToFahrenheit(100) == -279.40000000000003) {
                System.out.println("kelvinToFahrenheit test : good");
            } else {
                System.out.println("kelvinToFahrenheit test : bad");
            }
        } catch (Exception e) {
            System.out.println("kelvinToFahrenheit test : bad");
        }

        // fahrenheitToKelvin test
        try {
            if ((int)temperature.fahrenheitToKelvin(-279.40000000000003) == 100){
                System.out.println("fahrenheitToKelvin test : good");
            } else {
                System.out.println("fahrenheitToKelvin test : bad");
            }
        } catch (Exception e) {
            System.out.println("fahrenheitToKelvin test : bad");
        }
    }
}