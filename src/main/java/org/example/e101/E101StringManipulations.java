package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("In: ");
        String input = scanner.nextLine();

        // Print every other letter using a for loop
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }

        // Close the scanner
        scanner.close();
    }
}
