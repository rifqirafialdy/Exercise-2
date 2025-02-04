package org.Rifqi.Entity;

public class ConversionUtility {
    public static double celciusConverter(double fahrenheit) {
        return (5.0 / 9.0) * (32.0 - fahrenheit);
    }

    public static double kilometerConverter(double centimeter) {
        if (centimeter < 0) {
            throw new IllegalArgumentException("must positive");
        }
        return centimeter / 100000;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
