package polymorphism;

public class Parent1 {
    void show(){
        System.out.println("Parent method !");
    }
    
}
class Child1 extends Parent1{
    void childMethod(){
        System.out.println("Child method ");
    }
} 
class Test1{
    public static void main(String[] args) {
        Child1 c=new Child1();
        Parent1 p=c;
        p.show();
       // p.childMethod(); did not access 
    }
}