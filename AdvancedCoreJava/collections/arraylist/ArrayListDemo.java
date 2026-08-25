package AdvancedCoreJava.collections.arraylist;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);
        System.out.println(n);
        System.out.println(n.get(0));
        System.out.println(n.size());
        System.out.println(n.contains(20));
        System.out.println(n.set(0, 100));
        System.out.println(n.indexOf(30));
        System.out.println(n.lastIndexOf(0));
        System.out.println(n.remove(1));
        List<Integer>n1=new ArrayList<>();
        n.addAll(n1);
        System.out.println(n1);
        System.out.println(n.containsAll(n1));
        Object o=n.toArray();
        System.out.println(o);
        System.out.println(n.removeAll(n1));
        System.out.println(n1);
        System.out.println(n);
        n.clear();
        n1.clear();
        System.out.println(n);
        System.out.println(n1);

    }    
}
