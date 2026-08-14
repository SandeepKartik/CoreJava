package AdvancedCoreJava.LambdaExpression;

interface MathOperation {
    int multiplication(int a, int  b);    
}
class Test{
    public static void main(String[] args) {
        MathOperation m=(int a,int b) ->  a*b;  
        System.out.println(m.multiplication(10, 10)); 
    }
   

}