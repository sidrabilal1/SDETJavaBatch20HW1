package org.example.e125;

public class E125Variables {
    // Declare a static variable at the class level to hold an integer value
    static int number;

    public static void main(String[] args) {
        // Access the static variable in the main method and assign a value to it
           int number = 200;
        // Create an object of the class
        // Access the static variable in a non-static way using the object and assign a value of 200

        // Print the static variable using the class name

        // Print the static variable using the object instance
        E125Variables s1 = new E125Variables();
        s1.number = 200;

        System.out.println(E125Variables.number);
        System.out.println(number);

    }
}
