package AdvancedCoreJava.generics;
import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        // generics Declaration
        ArrayList<String> al=new ArrayList<>(100);
        al.add("Sam");
        al.add("Kartk");
       //  al.add(101);   compile time error
        System.out.println(al);
        // without declration generics
        ArrayList list=new ArrayList<>();
        list.add("Sam");
        list.add("Kartik");
        list.add(101);
        list.add(1.01f);
        System.out.println(list);
       // String name=list.get(3); runtime error  ClassCastException
       // using Explicite casting 
       /*int num=list.get(3);
       System.out.println(num);*/
        Integer name=(Integer) list.get(2);
        System.out.println(name);
    }    
}
