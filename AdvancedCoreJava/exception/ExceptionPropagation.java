package AdvancedCoreJava.exception;

public class ExceptionPropagation {
    static void methodC(){
        System.out.println("Program start from Method c ");
        int rsult=10/0;

    }
    static  void methodB(){
        methodC();
        System.out.println("This block from method B");
    }
    static void methodA(){
        methodB();
        System.out.println("This block from method A");
    }
    public static void main(String[] args) {
        try{
            methodA();
        }catch(ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
