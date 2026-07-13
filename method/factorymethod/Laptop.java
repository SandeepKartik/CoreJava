package factorymethod;

public class Laptop {
    String brand;
    Laptop(String brand){
        this.brand=brand;

    }
    static Laptop createLaptop(){
        return new Laptop("Dell");
    }
    void show (){
        System.out.println(brand);
    }
    public static void main(String[] args) {
        Laptop l=Laptop.createLaptop();
        l.show();
    }
}
