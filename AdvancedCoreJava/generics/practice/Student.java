package AdvancedCoreJava.generics.practice;

import java.util.ArrayList;
import java.util.List;

/*Student ka id → Integer
Student ka name → String
Students ko List mein store karein
Ek generic method se students display karein */
public class Student <T,U>{
    private T id;
    private U name;
    Student(T id, U name){
        this.id=id;
        this.name=name;
    }
     static  <T> T info(T value){
        return (value);
    } 
}
class Main{
    public static void main(String[] args) {
        List<Student<Integer,String>> l=new ArrayList<>();
      String name =  Student.info("Sam kartik");
      System.out.println(name);
      Integer id=Student.info(101);
      System.out.println(id);
      l.add(new Student<Integer,String>(101, "Sam kartik"));
      System.out.println(l);

        
    }
}
