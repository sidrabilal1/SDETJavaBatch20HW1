package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        convertToUpper();

    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string

    public static void convertToUpper(){
        String str = "test";
        System.out.println(str.toUpperCase());
    }
}
