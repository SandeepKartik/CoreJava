package AdvancedCoreJava.exception.trycatch;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Program start ...");
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("The number can not dividd by zero ...");
            System.out.println(e.getMessage());
        }
        System.out.println("Program ended ...");
    }
    
}
