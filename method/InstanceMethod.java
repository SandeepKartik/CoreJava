package method;

public class InstanceMethod {
    String name="Sam Kartik";
    void display(){
        System.out.println(name);
    }
    
}
class Test4{
    public static void main(String[] args) {
        InstanceMethod im=new InstanceMethod();
        im.display();
    }
}
