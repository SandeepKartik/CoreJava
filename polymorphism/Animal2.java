package polymorphism;

public class Animal2 {
    void sound(){
        System.out.println("Make sound ");
    }
}
class Dog extends Animal2{
    void eat(){
        System.out.println("Dogs are eats ");
    }
}
class Test2{
    public static void main(String[] args) {
        Animal2 a=new Dog();
        Dog d=(Dog) a;
        d.eat();
    }
}
