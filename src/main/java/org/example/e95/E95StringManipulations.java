package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Please enter a word: ");
        String input = scanner.nextLine();

        // Extract the first 3 letters
        String firstThreeLetters = input.substring(0, 3);

        // Print the result in the required format
        System.out.println("The first 3 letters of " + input + " is " + firstThreeLetters);

        // Close the scanner
        scanner.close();
    }
}





