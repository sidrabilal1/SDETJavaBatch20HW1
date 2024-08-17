package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        // Prompt the user to input a string value


        // Read the input string


        // Extract the first 3 letters using the substring() method

        // Print the result in the specified format

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String input = sc.nextLine();

        System.out.println("The first 3 letters of " + input + " is " + input.substring(0, 3));


    }
}
