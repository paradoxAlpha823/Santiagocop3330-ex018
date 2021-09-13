/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Double num = null;
        Scanner x = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\r\n"+"Press F to convert from Celsius to Fahrenheit.\r\n"+"Your Choice: ");
        String s1 = x.nextLine();
        String s2 = s1.toUpperCase(Locale.ROOT);
        if(s2.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            try {
                num = x.nextDouble();

            } catch (NumberFormatException exception) {
                System.out.print("Input only integer or double values please.");
                System.exit(0);
            }

            double c = Celsius(num);
            System.out.print("The temperature in Celsius is "+c+".");

        }else if(s2.equals("F")){

            System.out.print("Please enter the temperature in Celsius: ");
            try {
                num = x.nextDouble();

            } catch (NumberFormatException exception) {
                System.out.print("Input only integer or double values please.");
                System.exit(0);
            }
            double f = Fahrenheit(num);
            System.out.println("The temperature in Celsius is "+f+".");
        }else{
            System.out.println("Please enter either F or C");
            System.exit(0);
        }
        System.exit(0);
    }
    public static double Fahrenheit(double num) {
        double f = (num*1.8)+32;
        return f;
    }
    public static double Celsius(double num) {
        double c = (num-32)/1.8;
        return c;
    }
}