package car.example;

import car.Animal;

public class Dog extends Animal {

    public Dog(String name, String gender) {
        super(name, gender);
    }

    public void teaching() {

    }

    public static void main(String[] args){

        Dog poppy = new Dog("Poppy", "Male");

        poppy.teaching();

    }



}
