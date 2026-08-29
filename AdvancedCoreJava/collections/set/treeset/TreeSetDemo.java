package AdvancedCoreJava.collections.set.treeset;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        // adding elemnets 
        t.add(20);
        t.add(10);
        t.add(5);
        t.add(50);
        t.add(30);
        t.add(40);
        // printing elemnets 
        System.out.println(t);
        // removing elemnts 
        t.remove(5);
        System.out.println(t);
        // checking elments 
        System.out.println(t.contains(5));
        // checking size
        System.out.println(t.size());
        // checking its mpty or not 
        System.out.println(t.isEmpty());
        //finding first elemnet
        System.out.println(t.first());
        // findinf last element
        System.out.println(t.last());
        // finding lower value from a value 
        System.out.println(t.lower(25));
        // finding value from a value 
        System.out.println(t.higher(25));
        // finding flower value 
        System.out.println(t.floor(35));
        // finding ceiling value 
        System.out.println(t.ceiling(40));
        // use of pollFirst mehods
        int x=t.pollFirst();
        System.out.println(x);
        // use of pollLast method 
        int y=t.pollLast();
        System.out.println(y);
        // use of descandingSet Methods
        System.out.println(t.descendingSet());
        // use of descendingIterator methods
        Iterator<Integer> it=t.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }    
}
