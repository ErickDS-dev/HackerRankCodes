/*
* Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
* This is the fifth day codding
*
*  */


package javaCodes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DayFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayInteger = new int[3];
        ArrayList<String> arrayString = new ArrayList<>();

        try {
            readInput(sc, arrayString, arrayInteger);
        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter the correct data type.");
        }

        System.out.println(equalsString());
        printFormattedData(arrayString, arrayInteger);
        System.out.println(equalsString());
    }

    private static void readInput(Scanner sc, ArrayList<String> arrayString, int[] arrayInteger) {
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            arrayString.add(s1);
            arrayInteger[i] = x;
        }
    }

    private static void printFormattedData(ArrayList<String> arrayString, int[] arrayInteger) {
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d\n", arrayString.get(i), arrayInteger[i]);
        }
    }

    private static String equalsString() {
        return "================================";
    }
}

