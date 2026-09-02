package AdvancedCoreJava.collections.list;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListPractice {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(1,20);
        System.out.println(l.contains(10));
        System.out.println(l.remove(0));
        System.out.println(l);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        System.out.println(l);
        List <Integer> l2=new ArrayList<>(l);
        l.containsAll(l2);
        System.out.println(l2);
        l.addAll(l2);
        System.out.println(l2);
        l.removeAll(l2);
        System.out.println(l2);
        Object obj=l.toString();
        System.out.println(obj);

    }    
}
