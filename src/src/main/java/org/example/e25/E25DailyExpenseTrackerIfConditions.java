package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Step 1: Assign daily expenses
        double morningExpense = 20.75;
        double afternoonExpense = 30.50;
        double eveningExpense = 25.00;

        // Step 2: Calculate total expense
        double totalExpense = morningExpense + afternoonExpense + eveningExpense;

        // Step 3: Check if within budget
        double budget = 100.0;

        // Step 4: Print the results
        System.out.println("Your total daily expense is: " + totalExpense);

        if (totalExpense <= budget) {
            System.out.println("You are within the budget.");
        } else {
            System.out.println("You are over the budget.");
        }
    }
}