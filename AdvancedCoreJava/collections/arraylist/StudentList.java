package AdvancedCoreJava.collections.arraylist;
import java.util.List;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Sam");
        names.add("Kartik");
        names.add("Vishal");
        names.add("Kriti");
        names.add("Usha");
        System.out.println(names);
        System.out.println(names.get(2));
        System.out.println(names.contains("Kriti"));
        System.out.println(names.size());
        names.set(1, "Sandeep ");
        names.remove(3);
        System.out.println(names);
        System.out.println(names.size());
    }

    
}
