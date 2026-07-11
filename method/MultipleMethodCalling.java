package method;

public class MultipleMethodCalling {
    void A(){
        System.out.println("Starting of A");
        B();
        System.out.println("End Of A");
    }
    void B(){
        System.out.println("Start of B");
        C();
        System.out.println("End of B");
    }
    void C(){
        System.out.println("C Method is calling ");
    }
    
}
class Demo1{
    public static void main(String[] args) {
        MultipleMethodCalling m=new MultipleMethodCalling();
        m.A();
    }
}
