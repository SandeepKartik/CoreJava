package inheritance;

public class Person {
    String name="Sam";
    void walk(){
        System.out.println("Persong is walking now");
    } 
    
}
class Student extends Person{
    void study(){
        System.out.println("Student Start studing");
    }
}
class Demo{
    public static void main(String[] args) {
        Student st=new Student();
       System.out.println( st.name);
        st.walk();
        st.study();
    }
}