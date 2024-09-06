package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Step 1: Declare variables
        String operator = "*";
        int num1 = 10;
        int num2 = 5;

        // Step 2: Perform operation using if-else if-else conditions
        if (operator.equals("+")) {
            int result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            int result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            int result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            // Check if num2 is not zero to avoid division by zero error
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
