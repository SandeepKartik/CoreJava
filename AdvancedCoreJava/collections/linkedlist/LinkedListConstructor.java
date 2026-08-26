package AdvancedCoreJava.collections.linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListConstructor {
    public static void main(String[] args) {
        //Empty Constructor 
        LinkedList <Integer> l=new LinkedList<>();
        l.add(10);
        l.addFirst(20);
        l.addLast(30);
        System.out.println(l);
        // constructor with collection;
        LinkedList<Integer>l2=new LinkedList<>(l);
        System.out.println(l2);
        l2.removeLast();
        System.out.println(l2);
    }    
}
