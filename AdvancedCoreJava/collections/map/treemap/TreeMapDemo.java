package AdvancedCoreJava.collections.map.treemap;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        // adding elements
        tm.put(101, "Sam");
        tm.put(103,"Sam");
        tm.put(104,"Vishal");
        tm.put(102,"Kriti");
        // printing element
        System.out.println(tm);
        // use of first key
        System.out.println(tm.firstKey());
        // use of last key
        System.out.println(tm.lastKey());
        // use of first value
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        // use of higher key
        System.out.println(tm.higherKey(101));
        // use oflower key
        System.out.println(tm.lowerKey(103));
        // use of floor key
        System.out.println(tm.floorKey(103));
        //use of ceiling key
        System.out.println(tm.ceilingKey(103));
        // use of pollfirst
        System.out.println(tm.pollFirstEntry());
        // use of poll last 
        System.out.println(tm.pollLastEntry());
        // use of descanding order 
        System.out.println(tm.descendingKeySet());
        // use of contains key 
        System.out.println(tm.containsKey(101));
        System.out.println(tm.containsValue("Sam"));
        // use of clear
        tm.clear();
        System.out.println(tm);
    }
}
