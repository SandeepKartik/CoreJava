package abstractConcept;

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog start barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat do meuw");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
        Cat c=new Cat();
        c.sound();
    }
}