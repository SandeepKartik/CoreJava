package AdvancedCoreJava.generics.genericmethod;

public class Test1 {
    static <T> T getValue(T  Value){
        return Value;
    }
    public static void main(String[] args) {
        String name= getValue("Sam Kartik");
        Integer num=getValue(101);
        Double du=getValue(101.101);
        System.out.println(name);
        System.out.println(num);
        System.out.println(du);
    }
    
}
