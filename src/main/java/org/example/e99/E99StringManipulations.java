package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        // Prompt the user to input a string


        // Read the input string


        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();

        if(str1.equals(str2.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }
}