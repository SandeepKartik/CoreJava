package factorymethod;

public class Student {
    String name="Sam";
    static Student create(){
        Student s=new Student();
        return s;
    }
    void show(){
        System.out.println(name);
    }
    
}
class Demo{
    public static void main(String[] args) {
        Student s=Student.create();
        s.show();
    }
}