package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? (true/false)");
        // Capture the thirsty input
        boolean isThirsty = input.nextBoolean();
        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? (true/false)");
        // Capture the sleepy input
        boolean isSleepy = input.nextBoolean();
        // Determine the drink based on the inputs

        // Print the drink suggestion
        // Output: Looks like you need to drink ___
        if(isThirsty && !isSleepy){
            System.out.println("Looks like you need to drink water");
        }else if (isThirsty && isSleepy){
            System.out.println("Looks like you need to drink coffee");
        }else if(!isThirsty && isSleepy){
            System.out.println("Looks like you need to drink tea");


        }else {
            System.out.println("Looks like you need to drink nothing");
        }

    }
}
