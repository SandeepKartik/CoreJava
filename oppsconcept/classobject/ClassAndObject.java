package oppsconcept.classobject;

import java.util.Scanner;

public class ClassAndObject {
    String name;
    int age;
    
    
     
    void show(){
        System.out.println("Your name is :  "+name);
        System.out.println("Your age is : "+age);
    }
}
class Demo{
    public static void main(String[] args) {
        ClassAndObject s=new ClassAndObject();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
         s.age=sc.nextInt();
         sc.nextLine();
        System.out.print("Enter your name ");
        s.name=sc.nextLine();
        s.show();

    }
}