package polymorphism;

public class Animal3 {
    void sound(){
        System.out.println("Animl make sounds ");
    }
    
}
class Cat extends Animal3{
    void eat(){
        System.out.println("Cat drink milk ");
    }
}
class Birds extends Animal3{
    void fly(){
        System.out.println("Birds are fly ");
    }
}
class Test3{
    public static void main(String[] args) {
        Animal3 a=new Cat();
        if(a instanceof Cat){
            Cat c=(Cat) a;
            c.eat();
        }
    }
}
