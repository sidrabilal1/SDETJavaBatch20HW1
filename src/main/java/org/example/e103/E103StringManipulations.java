package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

// Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("In:");
        String input = scanner.nextLine();

        // Print each character separated by spaces
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if (i < input.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        // Close the scanner
        scanner.close();
    }
}







