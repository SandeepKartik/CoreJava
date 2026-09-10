package AdvancedCoreJava.generics.wildcard.lowerBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void Printlist(List<? super Integer> list){
        for(Object n:list){
            System.out.println(n);
            
        }
        list.add(10);
        list.add(50);
        list.add(60);
        System.out.println(list);
    }
    
}
class Main{
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(30);
        System.out.println(l);
        
    }
}
