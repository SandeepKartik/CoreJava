package encapsulation;

public class BankAccount {
    private String name;
    private double balance;
    public void setName(String name){
        this.name=name;
    } 
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setName("Sam Kartik ");
        b.setBalance(5000);
        System.out.println(b.getName());
        System.out.println(b.getBalance());
    }
}
