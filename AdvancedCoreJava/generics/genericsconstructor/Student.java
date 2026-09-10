package AdvancedCoreJava.generics.genericsconstructor;

public class Student {
    <T>Student(T value){
        System.out.println(value);
        System.out.println(value.getClass().getSimpleName());
    }
    
}
class Main{
    public static void main(String[] args) {
        Student st=new Student(100);
        Student st1=new Student("Sam kartik");
        Student st2=new Student(10.10);
        
    }
}
