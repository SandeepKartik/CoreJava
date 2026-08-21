package AdvancedCoreJava.collections;
import java.util.Collection;
import java.util.ArrayList;
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> student=new ArrayList<>();
        student.add("Sma");
        student.add("Vishal");
        student.add("Vishal ");
        student.add("Kriti");
        System.out.println("Student "+student);
        System.out.println("Contains element "+student.contains("Kriti"));
        System.out.println("To check Empty "+student.isEmpty());
        student.remove("Vishal");
        System.out.println(student);
        for(String students:student){
            System.out.println(students);
        }
        student.clear();
        System.out.println(student.isEmpty());
        System.out.println(student);

    }
    
}
