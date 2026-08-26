package AdvancedCoreJava.collections.set;
import java.util.Set;
import java.util.HashSet;
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> num=new HashSet<>();
        // adding Element
        System.out.println(num.add(10));
        System.out.println(num.add(20));
        System.out.println(num.add(10));
        System.out.println(num);
    }
    
}
