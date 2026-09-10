package AdvancedCoreJava.generics.boundedgenerics;

public class Test<T extends Number & Comparable<T>> {
    T value;
    Test(T value){
        this.value=value;
    }    
    void show(){
        System.out.println(value);
        System.out.println(value.getClass().getSimpleName());
    }
}
class Main1{
    public static void main(String[] args) {
        Test<Long> l=new Test<Long>(101101L);
        l.show();
    }
}
