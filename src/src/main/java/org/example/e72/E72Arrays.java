package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter day 1 of the week:");
       String day1=input.next();
        System.out.println("Please enter day 2 of the week:");
        String day2= input.next();
        System.out.println("Please enter day 3 of the week:");
        String day3= input.next();
        System.out.println("Please enter day 4 of the week:");
        String day4= input.next();
        System.out.println("Please enter day 5 of the week:");
        String day5= input.next();
        System.out.println("Please enter day 6 of the week:");
        String day6= input.next();
        System.out.println("Please enter day 7 of the week:");
        String day7= input.next();

        // Create an array of strings with size 7
     String[] names={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }




    }
}
