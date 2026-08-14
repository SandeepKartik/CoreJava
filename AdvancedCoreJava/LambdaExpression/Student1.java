package AdvancedCoreJava.LambdaExpression;

public class Student1 {
    String name;
    Student1(String name){
        this.name=name;
    }
    void showName(){
        System.out.println(name);
    }
    
}
class Main5{
    public static void main(String[] args) {
        Consumer<Student1> c=Student1::showName;
        Student1 s=new Student1("Sam ");
        Student1 a=new Student1("Kartik");
        c.accept(s);
        c.accept(a);
    }
}
