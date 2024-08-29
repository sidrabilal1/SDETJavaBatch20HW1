package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8};
        int highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println(highest);
    }
}