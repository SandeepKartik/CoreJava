package recursion;

public class DirectRecursion {
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1); // Direct call it self
    }
    public static void main(String[] args) {
        fun(5);
    }
    
}
