package AdvancedCoreJava.serialization;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("Sam");
        s.add("Kartik");
        s.add("Vishal");
        s.add("Kriti");
        s.add("Usha");
        s.add("Harishankar");
        //print List using Iterator
        Iterator<String>it=s.iterator();
        while(it.hasNext()){
            String name=it.next();
            System.out.println(name);
        }
        System.out.println("Normal "+s);
        //using for each loop 
        for(String sa:s){
            System.out.println(sa);
        }
        // List methods 
        s.set(1,"Visal_Karik");
        System.out.println(s.contains("Sam"));
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf("r"));
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.remove(1);
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
