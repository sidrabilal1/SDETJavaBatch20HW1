package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 2},
                {3, 1, 2},
                {3, 5, 3},
                {0, 1, 2}
        };

        int[] rowSums = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            rowSums[i] = sum;
        }

        for (int sum : rowSums) {
            System.out.println(sum);
        }
    }
}