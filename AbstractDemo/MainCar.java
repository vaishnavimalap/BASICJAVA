
// package AbstractDemo;

// Abstract class
abstract class Car {

    abstract void running();


    void CarDisplay() {
        System.out.println("I am in Main Car");
    }
}


class Maruti extends Car {
    @Override
    void running() {
        System.out.println("My Maruti car is running");
    }
}


public class MainCar {
    public static void main(String[] args) {
        
        Car c1 = new Maruti();
        c1.CarDisplay(); // Call method
        c1.running();    
    }
}
