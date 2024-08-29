package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Step 1: Declare a variable `score` and assign an integer value between 0 and 100
        int score = 85; // Example score, you can change this value to test different cases

        // Step 2: Calculate the grade using if-else if statements
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid"; // In case the score is out of range
        }

        // Print the letter grade
        if (!grade.equals("Invalid")) {
            System.out.println("Your grade is: " + grade);
        } else {
            System.out.println("Invalid score entered.");
        }
    }
}