package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        int x = scanner.nextInt();

        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}