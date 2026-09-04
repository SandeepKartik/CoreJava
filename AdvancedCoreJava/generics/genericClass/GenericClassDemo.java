package AdvancedCoreJava.generics.genericClass;

public class GenericClassDemo<T> {
    T Value;
    public void setValue(T Value){
        this.Value=Value;
    }
    T getValue(){
        return Value;
    }

    
}
class Student<T>{
    T name;
    Student(T name){
        this.name=name;
    }
    public void setValue(T name){
        this.name=name;
    }
    T getValue(){
        return name;
    }
}
class Main{
    public static void main(String[] args) {
        GenericClassDemo<String>  g=new GenericClassDemo<>();
        g.setValue("Sam Kartik");
        String name=g.getValue();
        System.out.println(name);
        //with Integer
        GenericClassDemo<Integer> l=new GenericClassDemo<>();
        l.setValue(101);
        l.setValue(102);
        Integer num=l.getValue();
        System.out.println(num);
        // with custome
        Student<String> s=new Student("Sam");
        s.setValue("Kartik");
        System.out.println(s.getValue()); 
    }
}
