package method;

public class StaticMethod {
    /*A static method in java is that method that will be called withoud creating object or referance 
    It is member of class not object 
    When class is load by class sub loder its make a copy in class Area   */

    public static  void printHello(){
        System.out.println("Hello Java ");
    }
    
}
class Demo{
    public static void main(String[] args) {
    
        StaticMethod.printHello(); // call with class name Not using  Object 
    
    }
}
