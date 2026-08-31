package AdvancedCoreJava.collections.map;
import java.util.Map;
import java.util.HashMap;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> student=new HashMap<>();
        // add element;
        student.put(101, "Sam");
        student.put(102, "Kriti");
        student.put(103, "Vishal");
        // printing map value
        System.out.println(student);
        // updating values;
        student.put(101,"Sam Kartik");
        System.out.println(student);
        // getting element through key
        System.out.println(student.get(101));
        // removing element
        System.out.println(student.remove(101));
        System.out.println(student);
        // checking key 
        System.out.println(student.containsKey(102));
        // chacking values
        System.out.println(student.containsValue("Kriti"));
        // chacking size
        System.out.println(student.size());
        // chacking empaty
        System.out.println(student.isEmpty());
        // clear map 
        student.clear();
        System.out.println(student);

    }
    
}
