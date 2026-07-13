
/**
 * Student
 */
public class Student {

    String name;
    int marks;
}
class Stu{
    Student createStudent(){
        Student s=new Student();
        s.marks=90;
        s.name="Sam";
        return s;
    }
    public static void main(String[] args) {
        Student st=new Student();
        Stu sp=new Stu();
        Student so=sp.createStudent();
        st.name="kartik";
        st.marks=91;
        System.out.println(so.marks);
        System.out.println(so.name);

    }
}    