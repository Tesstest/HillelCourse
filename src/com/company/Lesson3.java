package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Lesson3 {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        checkPassFail();
        checkOddEven();
        printNumberInWord();
        printDayInWord();
        compareMagnitudes();
    }

    public static int getIntegerInput(Scanner scan) {
        int number;
        while (!scan.hasNextInt()) {
            System.out.println("Try again! Enter an integer number: ");
            scan.next();
        }
        number = scan.nextInt();

        return number;
    }
    public static float getFloatInput(Scanner scan) {
        float number;
        while (!scan.hasNextFloat()) {
            System.out.println("Try again! Enter an integer number: ");
            scan.next();
        }
        number = scan.nextFloat();

        return number;
    }

    public static void checkPassFail() {
        int mark;
        System.out.println("Task1. Check Pass/Fail ");
        System.out.println("Enter an integer number:");

        mark = getIntegerInput(scan);

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE!");
    }

    public static void checkOddEven() {
        int number;
        System.out.println("Task 2. Check Odd/Even");

        number = getIntegerInput(scan);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("BYE!");
    }

    public static void printNumberInWord() {
        int number;
        String word = "OTHER";
        System.out.println("Task 3. Print nuber in word");

        number = getIntegerInput(scan);
        if (number == 1){
            System.out.println("ONE");
        } else if (number == 2){
            System.out.println("TWO");
        } else if (number == 3){
            System.out.println("THREE");
        } else if (number == 4){
            System.out.println("FOUR");
        } else if (number == 5){
            System.out.println("FIVE");
        } else if (number == 6){
            System.out.println("SIX");
        }else if (number == 7){
            System.out.println("SEVEN");
        }else if (number == 8){
            System.out.println("EIGHT");
        }else if (number == 9){
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }

        //Second way
        System.out.println("Task 3. Second way");

        number = getIntegerInput(scan);

        switch (number) {
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;

        }
        System.out.println(word);
    }

    public static void printDayInWord(){
        int number;
        String day = "Not a valid day";
        System.out.println("Task 4. Print day in word");
        System.out.println("Enter the day of a week");

        number = getIntegerInput(scan);

        switch (number){
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }

        System.out.println(day);
    }
    public static void compareMagnitudes(){
        float x;
        float y;
        float xAbs;
        float yAbs;

        System.out.println("Task 8. Compare Magnitudes");
        System.out.println("Enter first number (float)");
        x = getFloatInput(scan);
        System.out.println("Enter second number (float)");
        y = getFloatInput(scan);

        xAbs = Math.abs(x);
        yAbs = Math.abs(y);

        if (xAbs < yAbs) {
            System.out.println("Magnitude of " + y + " greater than " + x);
        } else if (xAbs > yAbs) {
            System.out.println("Magnitude of " + x + " greater than " + y);
        } else {
            System.out.println("Magnitude of " + x + " equals " + y);

        }
    }
}
