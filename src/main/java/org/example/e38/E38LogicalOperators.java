package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture boolean inputs
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = scanner.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = scanner.nextBoolean();

        // Step 3: Determine the subject
        String subject;
        if (isWeekend && isAvailable) {
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else {
            subject = "no subject";
        }

        // Step 4: Print the subject
        System.out.println("Today you will be learning " + subject);
    }
}








