package AdvancedCoreJava;

public class Bank {
    private static Bank b;
    private Bank(){

    }
    public static Bank getInstance(){
        if(b==null){
            b=new Bank();
        }
        return b;
    }
    
}
class Test{
    public static void main(String[] args) {
        Bank.getInstance();
        System.out.println(Bank.getInstance());
    }
}
