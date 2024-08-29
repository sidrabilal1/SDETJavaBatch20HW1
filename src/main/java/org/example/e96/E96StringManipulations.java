package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Please enter a programming language:");
        String language = scanner.nextLine();

        // Use conditional statements to print the description
        if (language.equalsIgnoreCase("Java")) {
            System.out.println("Java is a programming language");
        } else if (language.equalsIgnoreCase("C")) {
            System.out.println("C is a procedural programming language");
        } else if (language.equalsIgnoreCase("C++")) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");
        }

        // Close the scanner
        scanner.close();
    }
}