package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("In: ");

        String word = sc.nextLine();

        for(int i =0; i < word.length(); i+=2){
            System.out.print(word.charAt(i));


        }
        System.out.println();
    }
}
