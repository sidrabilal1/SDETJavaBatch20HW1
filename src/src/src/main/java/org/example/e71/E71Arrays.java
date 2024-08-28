package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        int[] indicesToExtract = {1, 4, 7}; // indices for values 78, 55, 77

        for (int i = 0; i < indicesToExtract.length; i++) {
            System.out.print(numbers[indicesToExtract[i]]);
            if (i < indicesToExtract.length - 1) {
                System.out.print(" ");
            }
        }
    }
}


