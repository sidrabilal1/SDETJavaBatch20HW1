package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("In: ");

        String input = sc.nextLine();

        for(int i = input.length()-1; i >=0; i--){
            char word = input.charAt(i);
            System.out.print(word);
        }
        System.out.println();




    }
}
