package org.example.e25;

import java.sql.SQLOutput;
public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
          double morningExpense = 25.42;
          double afternoonExpense = 25.42;
          double eveningExpense = 25.41;

        // Calculate total expense

          double totalExpense = morningExpense+afternoonExpense+eveningExpense;

        // Define a budget
         double Budget = 100.0;

        // Check if within budget
        System.out.println("Your total daily expense is: "+totalExpense);

         if (totalExpense<=Budget){
             System.out.println("You are within the budget.");

         }else{
            System.out.println( " you are over the budget ");
        }



    }
}
