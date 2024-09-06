package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        int[][] array = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0 && array[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}