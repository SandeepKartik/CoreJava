package abstractConcept.interfaceConcept;

interface  Animal3 {
    default void sound(){
        System.out.println("Animlas make sounds");
    }
}
interface Pet{
    default void sound(){
        System.out.println("Pets also make sound ");
    }
}
class Dog3 implements Animal3,Pet{
    @Override
    public void sound(){
        System.out.println("Dog make their own sound "); // we call it directly 
        //if you want call a specific class method then 
        Animal3.super.sound();
    }
}
class Test{
    public static void main(String[] args) {
        Dog3 d=new Dog3();
        d.sound();
    }
}
