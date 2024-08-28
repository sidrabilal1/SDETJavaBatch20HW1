package org.example.e118;

public class E118JavaMethods {


        // Method header as specified
        public static String spaceOut(String s) {
            StringBuilder spacedString = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                spacedString.append(s.charAt(i)).append(" ");
            }
            return spacedString.toString();
        }

        // Main method
        public static void main(String[] args) {
            // Test examples
            System.out.println(spaceOut("hello"));
            System.out.println(spaceOut("technology"));
        }
    }





