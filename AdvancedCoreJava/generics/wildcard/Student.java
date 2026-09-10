package AdvancedCoreJava.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Student {
    static void printlist(List<?> list){
        for(Object value :list){
            System.out.println("Value is : "+value);
            Object v=list.get(0);
            System.out.println(v);
        }
    }
    
}
class Main{
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Sam kartik");
        names.add("Vishal kartik");
        names.add("Kriti singh");
        System.out.println(names);
        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(12);
        num.add(20);
        System.out.println(num);

    }
}
