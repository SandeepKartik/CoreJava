package AdvancedCoreJava.collections.set.hashset;
import java.util.HashSet;

public class Student extends Object{
    int id;
    String name ;
    Student(int id, String name){
        this.name=name;
        this.id=id;
    }
    @Override
    public boolean equals(Object obj){
        Student other=(Student ) obj;
       return  this.id==other.id;
    }
    @Override
    public int hashCode(){
        return id;
    }
}
class Demo1{
    public static void main(String[] args) {
        Student s1=new Student(101, "Sam");
        Student s2=new Student(101, "Sam");
        Student s3=new Student(102, "Kartik");
        HashSet<Student> st=new HashSet<>();
        st.add(s1);
        st.add(s3);
        st.add(s2);
        System.out.println(st);
        System.out.println(st.size());
    }
}
