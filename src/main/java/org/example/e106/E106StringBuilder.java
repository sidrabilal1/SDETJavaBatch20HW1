package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate StringBuffer
        StringBuffer sb = new StringBuffer();

        // Append values to StringBuffer
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        // Convert to uppercase and print
        System.out.println(sb.toString().toUpperCase());
    }
}