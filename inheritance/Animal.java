package inheritance;

public class Animal {
    String name=" Wheel";
    void eat(){
        System.out.println("Animals are eating ");
    }
    
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Mammal are walking ");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dogs are barking in night ");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println(d.name);
        d.walk();
        d.eat();
        d.bark();
    }
}
