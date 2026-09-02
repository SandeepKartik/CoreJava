package AdvancedCoreJava.collections.map.linkedhashmap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        // adding elements 
        lhm.put(101, "Sam");
        lhm.put(103, "Kriti");
        lhm.put(102, "Vishal");
        // printing  // its mintain insertion order 
        System.out.println(lhm);
        // chacking elemnets 
        System.out.println(lhm.containsKey(102));
        // chacking Emapty
        System.out.println(lhm.isEmpty());
        // use of key iteration 
        for(int a:lhm.keySet()){
            System.out.println("The keys are : "+a);
        }
        // for value
        for(String name:lhm.values()){
            System.out.println("The values are : "+ name);
        }
        // for key values
        for(Map.Entry<Integer ,String> b: lhm.entrySet()){
            System.out.println(b.getKey()+" ---> "+b.getValue());
        }
        // for cleare map
        lhm.clear();
        System.out.println(lhm);
    }    
}
