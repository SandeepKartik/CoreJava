package recursion;

public class Gcd {
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
       int result= gcd(12, 18);
       System.out.println(result);
    }
    
}
