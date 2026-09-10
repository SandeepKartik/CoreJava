package AdvancedCoreJava.generics.boundedgenerics;

public class Calculator<T extends Number> {
    T value;
    Calculator(T value){
        this.value=value;

    }
    void show(){
        System.out.println("The values are : "+value);
        System.out.println("Info : "+value.getClass().getSimpleName());
    }
    
}
class Main{
    public static void main(String[] args) {
        Calculator<Integer> s=new Calculator<Integer>(101);
        s.show();
        // use of double
        Calculator<Double> d=new Calculator<Double>(101.101);
        d.show();
      /*   // use of string but not allowed  because of bounded
        Calculator<String> c=new Calculator<String>("Sam");
        c.show();*/
        // use of long
        Calculator<Long> l=new Calculator<Long>(101L);
        l.show();
    }
}
