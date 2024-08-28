package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare float variables and assign prices
        float item1 = 15.5f;
        float item2 = 23.0f;
        float item3 = 9.99f;
        float item4 = 27.49f;

        // Step 2: Calculate the total cost
        float totalCost = item1 + item2 + item3 + item4;

        // Step 2: Calculate the average cost
        float averageCost = totalCost / 4;

        // Step 3: Print the total cost and average cost with formatting
        System.out.println("The total cost is " + String.format("%.2f", totalCost));
        System.out.println("The average cost is " + String.format("%.3f", averageCost));

    }
}
