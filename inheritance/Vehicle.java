package inheritance;

public class Vehicle {
    String brand="BMW";
    void start(){
        System.out.println("Your car engine is  started");
    }
    
}
class Car extends Vehicle{
    void drive(){
        System.out.println("You start drive your car");
    }
}
class Main{
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c.brand);
        c.start();
        c.drive();
    }
}