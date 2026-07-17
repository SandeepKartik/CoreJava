package inheritance.overridding;

public class Animal {
    void sound(){
        System.out.println("Animal make sound : ");

    }
    
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();// due to sub class spacific implimentation of parent method means child class redefind the behaviour of methods according to their behaviours 
        
    }
}