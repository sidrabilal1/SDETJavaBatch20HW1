package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        // Step 1: Create variables
        int totalMeters = 1850;

        // Step 2: Calculate kilometers and meters
        int kilometers = totalMeters / 1000;
        int meters = totalMeters % 1000;

        // Step 3: Print the results
        System.out.println(totalMeters + " meters is equal to " + kilometers + " kilometers and " + meters + " meters.");

    }
}
