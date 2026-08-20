package AdvancedCoreJava.objectclass;

public class ToStringDemo extends Object{
    String name="Sam";
    int age=26;
    @Override
    public String toString(){
        return "Student {name = '"+name+"'age="+age+"}";
    }
}
class Main{
    public static void main(String[] args) {
        ToStringDemo t=new ToStringDemo();
        System.out.println(t);
        System.out.println(t.toString());
    }
}
