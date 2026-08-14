package AdvancedCoreJava.innerClass;

import AdvancedCoreJava.innerClass.Outer.Inner;

public class Outer {
    private int x=20;
    class Inner{
        int x=10;
        void show(){
            System.out.println(x); //10
            System.out.println(this.x);//10
            System.out.println(Outer.this.x);//20
        }

    }
    public void display(){
        //Inner i=new Inner();
        System.out.println("The show of inner class ");
    }
    
}
class Test{
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i= o.new Inner();
        o.display();
        i.show();
    }
}
