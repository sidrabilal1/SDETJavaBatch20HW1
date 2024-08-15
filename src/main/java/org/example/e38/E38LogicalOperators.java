package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");
        // Capture the weekend input
        boolean isWeekened = input.nextBoolean();
        // Determine the subject based on the input
        System.out.println("Are you available? (true/false)");
        boolean isAvailable = input.nextBoolean();
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"

        // Print the subject suggestion
        // Output: Today you will be learning ___
        if (isWeekened && isAvailable) {
            System.out.println("Today you will be learning Java");
        } else if (!isWeekened && isAvailable) {
            System.out.println("Today you will be learning manual testing");


        }else if (!isAvailable){
            System.out.println("Today you will be learning no subject");
        }


    }
}
