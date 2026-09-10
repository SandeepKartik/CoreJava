package AdvancedCoreJava.generics.genericClass;

public class Student1 <T,U>{
    T name;
    U age;
    Student1(T name, U age){
        this.name=name;
        this.age=age;
    }
    void setValue(T name,U age){
        this.name=name;
        this.age=age;
    }
    T getName(){
        return name;
    }
    U getAge(){
        return  age;
    }
}
class Main2{
    public static void main(String[] args) {
        Student1<String,Integer> s=new Student1<>("Sam ",27);
        System.out.println(s);
        s.setValue("Sam", 36);
        s.setValue("Kartik", 26);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.hashCode());
    }
}
