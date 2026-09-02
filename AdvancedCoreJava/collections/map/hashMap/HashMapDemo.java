package AdvancedCoreJava.collections.map.hashMap;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        // printing HashMap
        System.out.println(hm);
        // adding Elements
        hm.put(101, "Sam");
        hm.put(103, "Vishal");
        hm.put(102, "Kriti");
        System.out.println(hm);
        // chcking elements 
        System.out.println(hm.isEmpty());
        // chacking size 
        System.out.println(hm.size());
        // use of iteration on key
        for(int s:hm.keySet()){
            System.out.println(s);
        }
        // use of Itertion on value
        for(String names:hm.values()){
            System.out.println(names);
        }
        // for key value
        for(Map.Entry<Integer,String> sm:hm.entrySet()){
            System.out.println(sm.getKey()+" - -> "+sm.getValue());

        }
        // use of remove
        hm.remove(101);
        System.out.println(hm);
        // use of contains
        System.out.println(hm.containsKey(101));
        // use of clear
        hm.clear();
        System.out.println("After Clear map : "+hm);
    }
}
