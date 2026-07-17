package inheritance.overridding;

public class Mammal {
    protected void name(String a){
        System.out.println("Mammal name : "+a);
    }
    
}
class Human extends Mammal{
    public void name(String a){
        System.out.println("Human name : "+a);
    }
}
class Main1{
    public static void main(String[] args) {
        Human h=new Human();
        h.name("Sam");
    }
}
