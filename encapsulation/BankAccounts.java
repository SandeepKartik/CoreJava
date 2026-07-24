package encapsulation;

public class BankAccounts {
    private String accountHolder;
    private double balance;
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    void deposite(double amount){
        balance +=amount;
    }
    void withdrow(double amount){
        balance -=amount ;
    }
    public String getaccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }

}    
class Test1{
    public static void main(String[] args) {
        BankAccounts b=new BankAccounts();
        b.setBalance(1000.202);
        b.setAccountHolder("Sam kartik");
        System.out.println(b.getaccountHolder());
        System.out.println(b.getBalance());
        b.deposite(100.20);
        System.out.println(b.getBalance());
        b.withdrow(102.2020);
        System.out.println(b.getBalance());

    }
}