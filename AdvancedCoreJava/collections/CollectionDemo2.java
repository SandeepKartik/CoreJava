package AdvancedCoreJava.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(101);
        c.add(102);
        c.add(103);
        c.add(104);
        c.add(105);

        for(Integer num :c){
            System.out.println(num);
        }
        System.out.println(c);
        Object obj=c.toString();
        System.out.println(obj);
    }
    
}
