package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");

        // Capture the loan requirement input
        boolean needsLoan = input.nextBoolean();
        // Check if the user needs a loan

        // Step 1: Create a Scanner Object
        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditscore = input.nextInt();
            if ( creditscore < 600){
                System.out.println("The eligibility is Not eligible");
            }else if(creditscore >= 600 && creditscore <= 700){
                System.out.println("The eligibility is Maybe eligible");
            }else if(creditscore >= 701 && creditscore <= 800){
                System.out.println("The eligibility is Eligible");

            }else if(creditscore >800){
                System.out.println("The eligibility is Definitely eligible");
            }
        }else{
            System.out.println("The eligibility is Unknown");
        }




    }
}