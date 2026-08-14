package AdvancedCoreJava.LambdaExpression;
interface Consumer<T> {
    void accept(T value);
    
}
class Test2{
    public static void main(String[] args) {
        Consumer<String> c=message ->System.out.println(message);
        c.accept("Hello Sam...");
    }
}
