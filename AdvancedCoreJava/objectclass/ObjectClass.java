package AdvancedCoreJava.objectclass;

public class ObjectClass extends Object {
    String name="Sam kartik";
    
}
class  Demo{
    public static void main(String[] args) {
        ObjectClass o=new ObjectClass();
        System.out.println(o);
        System.out.println(o.toString());
    }
}
