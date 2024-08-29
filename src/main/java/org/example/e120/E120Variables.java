package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
public static


                  int year;
                  String schoolName;
                  int batchNumber;
                   void info(){
                      System.out.println("I am a student of" +batchNumber+ "studying at" +schoolName+ "in the year of" +year);
                  }


    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format

        E120Variables s1= new E120Variables();
        s1.year = 2020;
        s1.schoolName = "Syntax";
        s1.batchNumber= 6;
        s1.info();

    }
}
