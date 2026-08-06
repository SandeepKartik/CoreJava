package AdvancedCoreJava;

public class Bank1 {
    private static Bank1 instance;
    private Bank1(){

    }
    public static synchronized Bank1 getInstance(){
        if(instance == null){
            instance=new Bank1();
        }
        return instance;
    }
    
}
class Test1{
    public static void main(String[] args) {
    Bank1 b= Bank1.getInstance();
    Bank1 a=Bank1.getInstance();
    System.out.println(b==a);

    }
}
