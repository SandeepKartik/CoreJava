package AdvancedCoreJava.collections.set.linkedhashset;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSetDemo  {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        // adding element
        ls.add(30);
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(10);
        ls.add(100);
        ls.add(80);
        System.out.println("Set is :"+ls);

         // use iterator 
        Iterator <Integer> s=ls.iterator();
        while(s.hasNext()){
            int num=s.next();
            System.out.println(num);
        }



        //To Check size of elements 
        System.out.println(ls.size());
        // to check Empty or not
        System.out.println(ls.isEmpty());
        
        // to check element present or not 
        System.out.println(ls.contains(20));
        // to remove elemnts 
        System.out.println(ls.remove(10));
        // to clear set 
        ls.clear();
        System.out.println(ls);
       
    }
    
}
