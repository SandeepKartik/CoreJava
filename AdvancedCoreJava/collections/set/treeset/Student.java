package AdvancedCoreJava.collections.set.treeset;
import java.util.TreeSet;
import java.lang.Comparable;
public class Student implements Comparable<Student>{
    int id;
    int age;
    String name;
    Student(int id, int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }    
    @Override
    public int compareTo(Student other){
        return Integer.compare(this.id, other.id);
    }
}
class Main{
    public static void main(String[] args) {
        TreeSet<Student> student=new TreeSet<>();
        student.add(new Student(103, 26, "Kriti"));
        student.add(new Student(102, 22, "Vishal"));
        student.add(new Student(101, 26, "Sam "));
        System.out.println(student);
        System.out.println(student.size());
        System.out.println(student.descendingSet());
       // System.out.println(student.contains("Vishal"));
    }
}
