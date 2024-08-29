package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("In:");
        String input = scanner.nextLine().toLowerCase();

        // Print only the vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch);
            }
        }
        System.out.println();
    }}