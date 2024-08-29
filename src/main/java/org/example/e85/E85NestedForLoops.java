package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        int n = 7; // Number of lines in the top half of the pattern

        // Print the top half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print the bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}








