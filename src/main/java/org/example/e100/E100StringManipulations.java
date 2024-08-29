package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("In: ");
        String input = scanner.nextLine();

        // Reverse the string using a for loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println(reversed);

        // Close the scanner
        scanner.close();
    }
}