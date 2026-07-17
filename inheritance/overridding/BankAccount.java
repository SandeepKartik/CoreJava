package inheritance.overridding;

public class BankAccount {
    final void calculateIntrest(){
        System.out.println("Calculate intrest of main account ");
    }
    
}
class ChildAccount extends BankAccount{
    void calculateIntrest(){
        System.out.println("Calculate the intrest of child account ");
    }
}
class Tsts{
    public static void main(String[] args) {
        ChildAccount c=new ChildAccount();
        c.calculateIntrest();
    }
}
