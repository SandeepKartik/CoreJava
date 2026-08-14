package AdvancedCoreJava.innerClass.anonymousInnerClass;

public interface Payment {
    void pay();  
} 
class Test{
    public static void main(String[] args) {
        Payment p=new Payment() {
            @Override
           public  void pay(){
                System.out.println("Payment Successful...");
            }
        };
        p.pay();;
    }
}