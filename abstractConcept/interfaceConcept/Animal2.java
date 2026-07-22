package abstractConcept.interfaceConcept;

interface Animal2 {
    void sound();
    default void eat(){
        System.out.println("Animals are eating ");
    }
}
class Dog implements Animal2{
    @Override
    public void sound(){
        System.out.println("Dog Start Barking ");
    }
}
class Main2{
    public static void main(String[] args) {
        Animal2 a=new Dog();
        a.sound();
      a.eat();
    }
}