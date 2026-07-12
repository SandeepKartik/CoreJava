package method;

public class Car {
    String brand;
    void display(String brand){
        System.out.println(brand);
    }
    
}
class Test6{
    public static void main(String[] args) {
        Car c=new Car();
        c.display("Audi");
        Car c1=new Car();
        c1.display("BMW");
    }
}
