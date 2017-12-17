package com.company;
/*
This is JavaDoc
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Convertions {

    public static void main(String[] args) {
        System.out.println("Second task");
        convertions();
    }

    public static void convertions() {
        float outputValue;
        float inputValue;

        Scanner scan = new Scanner(System.in);

        //1. convert cel to foh
        System.out.println("Enter number Celsius: ");
        inputValue = checkIfFloat(scan);
        outputValue = inputValue * 9 / 5 + 32;
        System.out.println("It is " + outputValue + " Fohrenhate.");

        //2. convert foh to cel
        System.out.println("Enter number Fahrenhate: ");
        inputValue = checkIfFloat(scan);
        outputValue = (inputValue - 32)*5/9;
        System.out.println("It is " + outputValue + " Celsius.");

        //3. convert cel to kelvin
        System.out.println("Enter number Celsius: ");
        inputValue = checkIfFloat(scan);
        outputValue = (float) (inputValue + 273.16);
        System.out.println("It is " + outputValue + " Kelvin.");
    }


    private static float checkIfFloat(Scanner scan) {
        float value = 0;

        while (!scan.hasNextFloat()) {
            System.out.println("Please, enter a number: ");
            scan.next();
        }
        value = scan.nextFloat();
        return value;
    }

}
