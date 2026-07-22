package abstractConcept;

abstract public class Vihacle {
    Vihacle(){
        System.out.println("Vihacle Constructor ");
    }
    abstract void sound();
    final void start(){
        System.out.println("Car start with key ");
    }
    static void run(){
        System.out.println("Car is running ");
    }
    
}
class Car extends Vihacle{
    Car(){
        System.out.println("Car Constructor");
    }
    @Override
    void sound(){
        System.out.println("Car Make sound");
    }

}
class Main1{
    public static void main(String[] args) {
           Vihacle v=new Car();
            v.run();
            v.start();
    }
}