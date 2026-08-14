package AdvancedCoreJava.LambdaExpression;
interface Calculator {
    void calculation(int a,int b);
}
class Main1{
    public static void main(String[] args) {
        Calculator c=(a,b) -> {
            System.out.println(a+b);
        };
        c.calculation(10, 40);
    }
}