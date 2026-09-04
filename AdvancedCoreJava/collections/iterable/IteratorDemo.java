package AdvancedCoreJava.collections.iterable;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Vishal");
        list.add("Sam");
        list.add("Kriti");
        list.add("Kartik");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
        System.out.println();
        System.out.println("Using for each loop ");
        for(String name: list){
            System.out.println(name);
        }
    }
   
}
