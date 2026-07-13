package method;

public class PremitiveMethod {
    int squar(int n){
        System.out.println("Befor square"+n);
        n=n*n;
        System.out.println("After square "+n);
        return n;
    }

    
}
class Test2{
    public static void main(String[] args) {
        PremitiveMethod pm=new PremitiveMethod();
        int a=10;
        System.out.println(a);

       int result= pm.squar(a);
       System.out.println(result);
    }
}