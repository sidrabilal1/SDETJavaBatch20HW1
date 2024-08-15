package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value
        int temp = 25;

        // Check the temperature and print the message

        if (temp > 30) {
            System.out.println("It's hot outside.");

        } else if (temp > 20) {
            System.out.println("It's warm outside.");

        } else if (temp > 10) {
            System.out.println("It's cool outside.");

        } else if (temp < 10) {
            System.out.println("It's cold outside.");
        }

    }
}