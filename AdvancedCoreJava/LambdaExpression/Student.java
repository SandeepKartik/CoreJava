package AdvancedCoreJava.LambdaExpression;

public class Student {
    public void showName(String name){
        System.out.println(name);
    }
    
}
class Main4{
    public static void main(String[] args) {
        Student s=new Student();
        Consumer <String> c=s::showName;
        c.accept("Hey i'm Sam kartik");
    }
}
