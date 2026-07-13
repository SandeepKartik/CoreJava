package factorymethod;

public class BankAccount {
    String accountHolderName;
    int balance;
  /*   BankAccount(String accountHolderName,int balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }*/
    private BankAccount(String accountHolderName,int balance){
       this.accountHolderName=accountHolderName;
       this.balance=balance;
    }
    static BankAccount create(String accountHoldername){
        return new BankAccount(accountHoldername, 1000);
    }
    void show (){
        System.out.println(balance);
        System.out.println(accountHolderName);
    }
   
    
}
class Demo56{
    public static void main(String[] args) {
        BankAccount b=BankAccount.create("sam");
        b.show();
    }
}
