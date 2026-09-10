package AdvancedCoreJava.generics.genericmethod;

public class Student1 {
     public static <U> void display1(U num){
        System.out.println("The num is : "+num );
    }
    public <T> void print(T value){
        System.out.println("Value is : "+ value);
    }
    // use of return type 
    public static  <T> T getValue(T value){
        return  value;
    }
   
    
}
class Test{
    public static void main(String[] args) {
        Student1 s=new Student1();
        s.print("sam");
        s.print(101);
        s.print(10.10);
        s.print(true);
        s.print('C');
        Student1.display1(1);
        Student1.display1("Vishal kartik");
        String name=Student1.getValue("Sam kartik1 ");
        System.out.println(name);
    }
}
