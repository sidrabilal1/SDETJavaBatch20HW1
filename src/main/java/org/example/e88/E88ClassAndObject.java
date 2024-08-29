package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"

        // Call the methods 'bark()', 'run()', and 'play()' for each object
// Create the first object of the Dog class
        Dog husky = new Dog();
        husky.breed = "Husky";
        husky.name = "AnyName";
        husky.color = "AnyColor";

        // Create the second object of the Dog class
        Dog bulldog = new Dog();
        bulldog.breed = "Bulldog";
        bulldog.name = "AnyName";
        bulldog.color = "AnyColor";

        // Create the third object of the Dog class
        Dog labrador = new Dog();
        labrador.breed = "Labrador";
        labrador.name = "AnyName";
        labrador.color = "AnyColor";

        // Call methods for the first object
        husky.bark();
        husky.run();
        husky.play();

        // Call methods for the second object
        bulldog.bark();
        bulldog.run();
        bulldog.play();

        // Call methods for the third object
        labrador.bark();
        labrador.run();
        labrador.play();
    }
}



