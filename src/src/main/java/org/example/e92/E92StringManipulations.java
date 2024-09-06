package org.example.e92;

public class E92StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 's1' and assign the value "hello how are you" to it
        // Create a string variable and assign the value
        String s1 = "hello how are you";

        // Validate if the string ends with specific substrings and print the results
        System.out.println(s1.endsWith("u"));     // Expected output: false
        System.out.println(s1.endsWith("world")); // Expected output: false
        System.out.println(s1.endsWith("are"));   // Expected output: false
        System.out.println(s1.endsWith("you"));   // Expected output: true
    }
}