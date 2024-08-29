package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;
        int[][] table = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}