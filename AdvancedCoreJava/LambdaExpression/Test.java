package AdvancedCoreJava.LambdaExpression;

import java.util.function.Consumer;

public class Test {
    static void greet(String name){
        System.out.println("Hello "+name);
    }
    
}
class Main3{
    public static void main(String[] args) {
        Consumer<String> c=Test::greet;
        c.accept("Sam..");
    }
}
