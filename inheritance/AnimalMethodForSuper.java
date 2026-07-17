package inheritance;

public class AnimalMethodForSuper {
    String name="Eliphant";
    void eat(){
        System.out.println("Animal are eats green leaf");
    }
    
}
class Dog1 extends AnimalMethodForSuper{
    void bark(){
        super.eat();
        System.out.println(super.name);
        System.out.println("Dogs are bark at night ");
    }
}
class Test{
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.bark();
    }
}