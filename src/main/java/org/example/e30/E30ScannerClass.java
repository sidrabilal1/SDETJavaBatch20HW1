package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        Scanner input = new Scanner(System.in);
        // Print prompt for user to input the month number
        System.out.println("Please enter the month number");

        // Capture the month number
        int monthNumber =input.nextInt();

        // Check the value of monthNumber and identify the m
        // If the value is between 1 and 12, print the corresponding month name

        // If the value is out of range, print "Invalid"




        if (monthNumber>=1 && monthNumber<=12){
            System.out.println("January");
        }else {
            System.out.println("Invalid");
        }
    }
}