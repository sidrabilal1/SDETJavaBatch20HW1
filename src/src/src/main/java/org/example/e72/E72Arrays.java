package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = new String[7];

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week:");
            daysOfWeek[i] = scanner.nextLine();
        }

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }
    }
}





