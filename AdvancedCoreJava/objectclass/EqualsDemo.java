package AdvancedCoreJava.objectclass;

public class EqualsDemo {
    int id;
    EqualsDemo(int id){
        this.id=id;
    }
   /*  @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;

    }
    
}
class Test{
    public static void main(String[] args) {
        EqualsDemo e=new EqualsDemo(101);
        EqualsDemo ed=new EqualsDemo(101);
        System.out.println(e==ed);
        System.out.println(e.equals(ed));
    }
}*/