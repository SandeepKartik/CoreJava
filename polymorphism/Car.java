package polymorphism;

public class Car {
    void run(){
        System.out.println("Car running at high speed ");
    }
    
}
class Bike extends Car{
    @Override
    void run(){
        System.out.println("Bike run at medium speed ");
    }
} 
class Main4{
    public static void main(String[] args) {
        Car c=new Bike();
        c.run();
    }
}