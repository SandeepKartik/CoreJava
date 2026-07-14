package recursion;

public class IndirectRecursion {
    static void  funA(int n){
        if(n<=0)
            return;
        System.out.println("A : "+n);
        funB(n-1);
    }
    static void funB(int n){
        if(n<=0)
            return;
        System.out.println("B : "+n);
        funA(n-1);
    }
    public static void main(String[] args) {
        funA(5);
        funB(10
            
        );
    }
}
