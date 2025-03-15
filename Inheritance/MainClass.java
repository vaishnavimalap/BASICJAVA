//package Inheritance;

class Animal {
    // Members --> variables
    int noOfLegs = 4;
    String name = "Animal";
    int ears = 2;
    String color = "default";    

    // Members --> Method
    void displayAnimal() {
        
        System.out.println("No of legs: " + noOfLegs);
        System.out.println("Name: " + name);
        System.out.println("No of ears: " + ears);
        System.out.println("Color: " + color);
    }
}

class Cat extends Animal {
    String catBreed = "Default";

    @Override
    void displayAnimal() {
        name = "Jenny";
        color = "Black & Orange";
        System.out.println("Cat breed: " + catBreed);
        super.displayAnimal();
    }
}

class PersianCat extends Cat {
    @Override
    void displayAnimal() {
        catBreed = "Persian";
        super.displayAnimal();
    }
}

public class MainClass {
    public static void main(String[] args) {
        PersianCat pcat = new PersianCat();
        pcat.displayAnimal();
    }
}
