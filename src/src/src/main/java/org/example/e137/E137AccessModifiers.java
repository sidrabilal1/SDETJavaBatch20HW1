package org.example.e137;

public class E137AccessModifiers {

        String name;
        String city;
        String nameOfSchool ;
        int batchNumber ;

        void printName(){
            System.out.println("name");
        }
        void printCity(){
            System.out.println("city");
        }
        void printNameOfSchool(){
            System.out.println("nameOfSchool");
        }
        void printAge(){
            System.out.println("batchNumber");

        }
        void method(){
            System.out.println("My name is " +name+ " and I live in " +city+ "."+" I study at " +nameOfSchool+ " in batch " +batchNumber);
        }
        public static void main(String[] args) {
         E137AccessModifiers m = new E137AccessModifiers();
         m.name ="John";
         m.city ="Miami";
         m.nameOfSchool="Syntax";
         m.batchNumber =9;
            m.method();

    }
}

