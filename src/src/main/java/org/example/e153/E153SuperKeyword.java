package org.example.e153;

import org.example.e87.Car;
class Vehicle {


    public Vehicle() {
        System.out.println("This is the Vehicle constructor");
    }
}
  class car extends Vehicle {

    public car(){
        super();
    }
  }


public class E153SuperKeyword {
    public static void main(String[] args) {
        car c = new car();


    }
}
