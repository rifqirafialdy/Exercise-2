package org.Rifqi;

import org.Rifqi.Entity.ConversionUtility;
import org.Rifqi.Entity.StringUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double fahrenheit = 10;
        System.out.println("Fahrenheit " + fahrenheit + " = Celcius " + ConversionUtility.celciusConverter(fahrenheit));
        double centimeter = 20000000;
        System.out.println(centimeter + " Centimeter = " + ConversionUtility.kilometerConverter(centimeter) + "km");
        int number = 4;
        System.out.print(number + " is even = " + ConversionUtility.isEven(number) + "\n");
        System.out.print(StringUtility.deleteWord("", "wld") + "\n");
        System.out.print(StringUtility.isPalindrome(""));
    }
}