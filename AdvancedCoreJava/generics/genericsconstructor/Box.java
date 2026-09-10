package AdvancedCoreJava.generics.genericsconstructor;

public class Box <T>{
    T data;
    Box(T data){
        this.data=data;
    }
    <U> Box(U name,String message){
        System.out.println(name);
        System.out.println(message);
    }
    void display(){
        System.out.println(data);
    }

    
}
class Main1{
    public static void main(String[] args) {
        Box<String> s=new Box<String>("Sam kartik");
        Box<String> s1=new Box<>("Vishal kartik", "Hey vishal !");
        s.display();
    }
}
