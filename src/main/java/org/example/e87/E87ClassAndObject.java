package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        // Create the second object of the class 'Car'

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object

        // Print the values of the properties for both objects in the specified format
         Car car = new Car();
         car.carColor = "Black";
         car.carYear = 2019;
         car.carMake = "BMW";

        System.out.println("Car color is " +car.carColor+" and car year is " +car.carYear+ " and car model is "+car.carMake );

        Car car1 = new Car();
        car1.carColor = "White";
        car1.carYear = 2018;
        car1.carMake = "Toyota";

        System.out.println("Car color is "+car1.carColor+" and car year is " +car1.carYear+ " and car model is "+car1.carMake );




    }
}
