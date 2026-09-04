package AdvancedCoreJava.generics.genericmethod;

public class Student {
    public static <T> T getValue(T value){
        return value;
    }
    public static void main(String[] args) {
        String name=getValue("Sam kartik");
        System.out.println(name);
    }
    
}
