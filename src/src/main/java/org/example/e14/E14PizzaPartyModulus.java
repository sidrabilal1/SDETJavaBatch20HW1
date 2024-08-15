package org.example.e14;

import org.w3c.dom.ls.LSOutput;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
          int totalSlices = 13;
          int friends = 4;

        // Calculate slices per person
         int div = totalSlices/friends;
         int totalslices= div;
         int mod = totalSlices%friends;

        // Print the results
        System.out.println("Each person gets "+div+" slices.");
        System.out.println("There are "+mod+" slices left over.");

    }
}
