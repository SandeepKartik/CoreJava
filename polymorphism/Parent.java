package polymorphism;

public class Parent {
    void sound(){
        System.out.println("Parents class  ");
    }
    
}
class Child extends Parent{
    @Override
    void sound(){
        System.out.println(" Child class");
    }
}
class Main3{
    public static void main(String[] args) {
        Parent p=new Child();
        p.sound();
    }
}
