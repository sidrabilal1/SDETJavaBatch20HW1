package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        // Create the string variable
        String given = "I love Java classes at Syntax";

        // Retrieve and print the substrings
        System.out.println(given.substring(12)); // "classes at Syntax"
        System.out.println(given.substring(0, 11)); // "I love Java"
    }
}