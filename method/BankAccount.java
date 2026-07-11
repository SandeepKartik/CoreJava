package method;

public class BankAccount {
    double balance=1000;
    void deposit(double amount){
        balance=balance+amount;
        System.out.println(balance);
    }
    
}
class Test5{
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.deposit(1500.01);
    }
}