package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        // Use nested loops to iterate through the 2D array and double the value of each element

        // Use nested loops to iterate through the 2D array and print each value
        for(int row=0; row <3; row++){

        for(int col=0; col<4; col++){
            System.out.print(a[row][col]*2+" ");
        }
            System.out.println();
        }
    }
}
