package AdvancedCoreJava.exception.trycatch;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Program started ...");
        try{
            String name=null;
            System.out.println(name);
        }
        catch(ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }
        finally{
            System.out.println("This is always run in any condition ....");
        }
    }
    
}
