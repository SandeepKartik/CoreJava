package AdvancedCoreJava.collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Sam");
        l.add("Vishal");
        l.add("Kriti");
        Iterator<String> it=l.iterator();
        while(it.hasNext()){
            String name=it.next();
            System.out.println(name);

        }
        System.out.println("Using For each Loop");
        for(String name:l){
            System.out.println(name);
        }

    }
    
}
