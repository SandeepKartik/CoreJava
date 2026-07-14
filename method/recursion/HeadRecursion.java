package recursion;

public class HeadRecursion {
    static void print(int n){
        if(n==0)
            return;
        print(n-1); // head recursion 
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
    
}
