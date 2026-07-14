package recursion;

public class CallingAndReturningPahase {
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println("Calling Phase : "+n);
        fun(n-1);
        System.out.println("Returning Phase : "+n);
    }
    public static void main(String[] args) {
        fun(5);
    }
    
}
