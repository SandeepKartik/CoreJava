package AdvancedCoreJava.innerClass;

public class Car {
    static class Engine{
        void start(){
            System.out.println("Engine has started : ");
        }
    }
    
}
class Test2{
    public static void main(String[] args) {
        Car.Engine e=new Car.Engine();// independet object exist of engine due to static
        e.start();
    }
}
