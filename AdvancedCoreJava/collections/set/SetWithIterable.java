package AdvancedCoreJava.collections.set;
import java.lang.*;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class SetWithIterable  {
    public static void main(String[] args) {
        Set <Integer> num=new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(10);
        num.add(50);
        System.out.println(num);
        Iterator<Integer> it=num.iterator();
        while (it.hasNext()) {
            int num1=it.next();
            System.out.println(num1);
            
        }
        
    }
}
