package AdvancedCoreJava.LambdaExpression;

public interface Greeting {
    void greet();
}
class Main{
    public static void main(String[] args) {
        Greeting g=() ->{
            System.out.println("Hello Kartik... ");
        };
        g.greet();
    }
}