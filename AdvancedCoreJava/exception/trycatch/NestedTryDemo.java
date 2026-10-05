package AdvancedCoreJava.exception.trycatch;

public class NestedTryDemo {
    public static void main(String[] args) {
        
    
    try{
        System.out.println("Outer try starts ...");
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Outer try continues...");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    System.out.println("Outer try ended .... ");   
}
}
