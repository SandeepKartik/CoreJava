package polymorphism;

public class Vehicle {
    void sound(){
        System.out.println("Vehicle make sounds ");
    }
}
class Car1 extends Vehicle{
    @Override
    void sound(){
        System.out.println("Carv make little amount of sound ");
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle v=new Car1();
        v.sound();
    }
}
