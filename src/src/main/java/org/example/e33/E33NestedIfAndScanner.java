package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
         Scanner input = new Scanner(System.in);
        // Print prompt for user to enter a number
        System.out.println("Please enter a number");
        // Capture the number input
        int number = input.nextInt();
        int residue = number % 2;

        // Classify the number
        // Use an if-else statement to check if the number is even or odd
        // If the number is even
        //    Print "Value is even"
        //    Use another if-else statement to check if the number is greater than 1000
        //        If it is, print "Even value is large"
        //        Otherwise, print "Even value is just right"
        // If the number is odd
        //    Print "Value is odd"
        //    Use another if-else statement to check if the number is greater than 1000
        //        If it is, print "Odd value is large"
        //        Otherwise, print "Odd value is just right"
        if(residue >0){
            System.out.println("Value is odd");
            if(number> 1000) {
                System.out.println("Odd value is large");
            }else{
                System.out.println("Odd value is just right");

            }
        }else {
            System.out.println("Value is even");
            if(number>1000) {
                System.out.println("Even value is large");
            }else {
                System.out.println("Even value is just right");
            }
        }
    }
}
