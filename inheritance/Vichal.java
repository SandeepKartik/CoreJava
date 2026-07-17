package inheritance;

public class Vichal {
    String brand="BMW";
    void start(){
        System.out.println("Car has started ");
    }
}    
class Car1 extends Vichal{
    private String name="Audi";
    void run(){
        System.out.println(super.brand);
        System.out.println("Car is runing");
    }
    void show(){
        System.out.println(super.brand);
        System.out.println(name);
    }
}
class Main3{
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.show();
        c.run();
        c.start();

    }
}