package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create the string variable
        String given = "Hello Syntax friends";

        // Manipulate the string to create the new string
        String newString = given.replace("Hello", "Welcome").replace("friends", "family");

        // Print the result
        System.out.println(newString);
    }
}