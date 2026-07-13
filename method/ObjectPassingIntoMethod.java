package method;

public class ObjectPassingIntoMethod {
    
    String      name="kartik";
    
    
}
class Demo3{
    void  change(ObjectPassingIntoMethod s){
        s.name="Sam";
    }
    public static void main(String[] args) {
        Demo3 d=new Demo3();
        ObjectPassingIntoMethod  s=new ObjectPassingIntoMethod();
        s.name="vishl";
        d.change(s);
        System.out.println(s.name);
    }
}