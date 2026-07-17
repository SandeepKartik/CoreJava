package inheritance;

public class PersonToInvokeConstructor {
    protected String name="Sam";
    PersonToInvokeConstructor(){
        System.out.println("Person work hard");
    }
    void eat(){
        System.out.println("Eats Apple");
    }
    
}
class StudentS extends PersonToInvokeConstructor{
     StudentS(){
        super(); // for constructo of parent class
        System.out.println(super.name);// for instance variable of parent class
        super.eat();// for method of parent class
        System.out.println("Student study ");
    }
}
class Test2{
    public static void main(String[] args) {
        StudentS s=new StudentS();
        
    }
}