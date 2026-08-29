package AdvancedCoreJava.collections.set.treeset;
import java.util.TreeSet;
import java.util.Comparator;
public class StudentDemo {
    int id;
    String name;
    StudentDemo(int id, String name){
        this.name=name;
        this.id=id;
    }
    
}
class Test{
    public static void main(String[] args) {
        Comparator<StudentDemo> byName =new Comparator<StudentDemo>() {
            @Override
            public int compare(StudentDemo s1, StudentDemo s2){

                return s1.name.compareTo(s2.name);
            }
        };
        TreeSet<StudentDemo> st=new TreeSet<>(byName);
        st.add(new StudentDemo(101, "Sam"));
        st.add(new StudentDemo(103, "Kriti"));
        st.add(new StudentDemo(102, "Vishal"));
        System.out.println(st);
        System.out.println(st.size());
        for(StudentDemo s:st){
            System.out.println(s);
        }
    }
}
