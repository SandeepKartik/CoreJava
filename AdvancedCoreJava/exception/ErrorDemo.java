package AdvancedCoreJava.exception;

public class ErrorDemo {
    static void test(){
        test();
    }
    public static void main(String[] args) {
        //  gives stack overflow due to it call it self 
        test();
    }
    
}
