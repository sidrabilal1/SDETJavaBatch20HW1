package org.example.e145;



    class Dog {
        String dogName;
        double dogWeight;
        static String dogBreed="Mutt";

        Dog(String dogName,double dogWeight){
            this.dogName=dogName;
            this.dogWeight=dogWeight;
        }
        void Display(){
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);
        }
    }

    public class E145ThisKeyword {
        public static void main(String[] args) {
            Dog obj = new Dog("Tarzan", 50.0);
            Dog obj1 = new Dog("Lucy", 10.0);
            obj.Display();
            obj1.Display();
        }
    }




