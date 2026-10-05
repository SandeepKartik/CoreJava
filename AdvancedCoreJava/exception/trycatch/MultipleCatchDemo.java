package AdvancedCoreJava.exception.trycatch;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("Program started ... ");
        try{
            int [] arr=new int[5];
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;
            System.out.println(arr[6]);
                
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Program Ended ... ");
    }
    
}
