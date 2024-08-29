package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create an array of String elements with a size of 5
        String[] names = new String[5];

        // Prompt the user for input
        System.out.println("Please enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        // Print the first three characters of each name
        System.out.println("First three characters of each name:");
        for (String name : names) {
            if (name.length() >= 3) {
                System.out.println(name.substring(0, 3));
            } else {
                System.out.println(name);
            }
        }

        // Close the scanner
        scanner.close();
    }
}