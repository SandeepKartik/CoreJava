package inheritance;

public class PersonConstructorChining {
    PersonConstructorChining(){
        System.out.println("First Constructor  ");
    }
    
}
class Student2 extends PersonConstructorChining{
    Student2(){
        System.out.println("Secound Constructor");
    }
}
class Sam extends Student2{
    Sam(){
        System.out.println("Work hard");
    }
}
class Test3{
    public static void main(String[] args) {
        Sam s=new Sam();
        
    }
}