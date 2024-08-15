package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern
        for(int i =6; i< 11; i++){
            for(int j = 1; j< 11; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }
}
