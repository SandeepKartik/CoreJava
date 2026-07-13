package factorymethod;

public class Pen {
    String brand="Writo Meter";
    static Pen create(){
        System.out.println("Object creation");
        return new Pen();
    }
    void show(){
        System.out.println(brand);
    }
    
}
class Demoo{
    public static void main(String[] args) {
        Pen.create().show();
    }

}