package AdvancedCoreJava.collections.set.hashset;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> k=new HashSet<>();
        // Using HashSet methods 
        // adding element
        k.add(10);
        k.add(20);
        k.add(10);
        k.add(30);
        k.add(40);
        k.add(50);
        System.out.println(k);
        // check elements present or not 
        System.out.println(k.contains("Yes its present : "+50));
        // checking size 
        System.out.println(k.size());
        // removing element
        k.remove(10);
        System.out.println(k);
        // checking empty or not
        System.out.println(k.isEmpty());
        // clear set 
        k.clear();
        System.out.println(k);
    }
    
}
