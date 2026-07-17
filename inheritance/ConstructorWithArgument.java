package inheritance;

public class ConstructorWithArgument {
    ConstructorWithArgument(String name){
        System.out.println(" Your name is : "+name);
    }
    
}
class Sam1 extends ConstructorWithArgument{
    Sam1(){
        super("Sam");
        System.out.println("Work hard ");
    }
}
class Test4{
    public static void main(String[] args) {
        Sam1 s=new Sam1();
    }
}
