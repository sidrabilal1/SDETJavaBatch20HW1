package org.example.e22;

public class E22UserInformationAndAgeCheckIfConditions {
    public static void main(String[] args) {
        // Step 1: Declare variables
        String name = "Weqas";
        String mobileNumber = "123-456-7890";
        int age = 45;

        // Step 2: Print user information
        System.out.println("Your name is " + name + ", your age is " + age + ", and your mobile number is " + mobileNumber);

        // Step 3: Check age using if-else condition
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }
}