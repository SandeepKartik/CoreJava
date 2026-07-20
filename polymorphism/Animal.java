package polymorphism;

public class Animal {
    void eat(){
        System.out.println("Animal are eats");
    }
    
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog are eat Paddigry");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a=new Dog(); // referance type Animal but Actual object is dog
        a.eat();
    }
}