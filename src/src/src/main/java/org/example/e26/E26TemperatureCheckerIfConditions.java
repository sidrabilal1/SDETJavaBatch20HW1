package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Step 1: Declare a variable `temperature` and assign 25 to it
        int temperature = 25;

        // Step 2: Check the temperature using if-else-if conditions
        if (temperature >= 30) {
            System.out.println("It's hot outside.");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("It's warm outside.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's cool outside.");
        } else if (temperature < 10) {
            System.out.println("It's cold outside.");
        }
    }
}
