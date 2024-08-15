package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
         char operator ='*';

        // Declare two variables for numbers and assign values
          int num1 = 25;
          int num2 = 2;
         int result = num1*num2;
        // Perform the corresponding arithmetic operation

        if(operator=='+') {
            System.out.println("The sum is: " +result);
        }else if(operator=='-'){
                System.out.println("The diffrence is: " +result);
            }else if (operator=='*'){
                System.out.println("The product is: " +result);

            }else if(operator=='/'){
                System.out.println("The quotient is; " +result);

            }else{
            System.out.println("Invalid operator");
        }
    }
}
