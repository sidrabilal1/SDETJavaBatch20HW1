package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Please enter a browser name:");
        String browser = scanner.nextLine();

        // Use conditional statements to validate the browser name
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }

        // Close the scanner
        scanner.close();
    }
}







