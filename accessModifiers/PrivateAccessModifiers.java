package accessModifiers;

public class PrivateAccessModifiers {
   
        /* The Protected Access Modifiers are those modifiers that is most restricted 
        and least accessible it will be access only in same class   */

    private String name="sam";
    private int age =26;
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    
}
class test{
    public static void main(String[] args) {
        PrivateAccessModifiers p=new PrivateAccessModifiers();
        p.display();
        // if we do p.name or p.age its give compile time error 
        // due to its not in same class 
    }
}
