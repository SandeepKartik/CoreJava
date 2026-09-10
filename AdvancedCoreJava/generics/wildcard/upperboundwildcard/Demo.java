package AdvancedCoreJava.generics.wildcard.upperboundwildcard;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public void printList(List<? extends Number>list){
        for(Number n: list){
            System.out.println(n);
            Number num=list.get(0);
            System.out.println(num);

        }
    }
    
}
class Main{
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);
        System.out.println(n);
        List<Long> l=new ArrayList<>();
        l.add(1010L);
        l.add(1020L);
        l.add(303L);
        System.out.println(l); 
    }
}