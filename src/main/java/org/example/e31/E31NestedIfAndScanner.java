package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Capture weather information
        System.out.println("Is it sunny outside? (true/false)");
        boolean isSunny = scanner.nextBoolean();

        // Provide activity suggestions based on the weather
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temperature = scanner.nextInt();
            if (temperature > 85) {
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        } else {
            System.out.println("I stay home and practice Java!");
        }
    }
}


