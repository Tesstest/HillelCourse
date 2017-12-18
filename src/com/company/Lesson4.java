package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        //findMin();
        //sortArray();
        //palindrom();
        reversString();
    }

    public static void findMin() {
        //Task 3. Find min in array
        int[] array = {8, 9, 6, 1, 7, 10, 100, 13, 0, 65, 89, 2, -90};
        //assume that 0th element is min
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimum is " + min);
    }

    public static void sortArray() {
        //Task 5. Sort an array
        int[] array = {8, 9, 6, 1, 7, 10, 100, 13, 0, 65, 89, 2, -90};
        int temp;
        boolean isSorted = false;
        int endOfArray = array.length - 1;

        //bubble sort
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < endOfArray; i++) {
                if ((array[i] > array[i + 1])) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            endOfArray--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void palindrom(){
        //Task 6. Palindrom
        String text;
        boolean sameChars = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");

        text = scan.nextLine();
        text = text.toLowerCase();
        text = text.replaceAll("\\s+","");

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++){
            if (chars[i] != chars[chars.length - 1- i]){
                sameChars = false;
            }
        }

        if (sameChars){
            System.out.println("It is palindrom!");
        } else {
            System.out.println("It is not palindrom!");
        }
    }

    public static void reversString() {
        //Task 7. Revers string
        String text;
        String revers;
        char temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");

        text = scan.nextLine();
        char[] chars = text.toCharArray();
        for (int i=0; i < chars.length/2; i++ ){
            temp = chars[i];
            chars[i] = chars[chars.length - 1- i];
            chars[chars.length - 1- i] = temp;
        }
        revers = new String(chars);
        System.out.println(revers);
    }
}
