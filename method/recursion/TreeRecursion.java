package recursion;

public class TreeRecursion {
    static void print(int n){
        if(n==0)
            return ;
        System.out.println("Before : "+n);
        print(n-1);
        print(n-1);
        System.out.println("After : "+n);
    }
    public static void main(String[] args) {
        print(2);
    }
    
}
