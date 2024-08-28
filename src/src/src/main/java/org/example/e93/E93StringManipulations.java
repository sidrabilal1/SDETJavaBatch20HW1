package org.example.e93;

public class E93StringManipulations {
    public static void main(String[] args) {
        // Create string variables
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        // Find and print the positions of substrings
        System.out.println(str.indexOf('c'));       // Position of 'c'
        System.out.println(str.indexOf(' '));       // Position of space
        System.out.println(str.indexOf(target1));   // Position of "dab"
        System.out.println(str.indexOf(target2));   // Position of "ABRA" (case-sensitive)
    }
}