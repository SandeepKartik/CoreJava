package recursion;

public class ReverseDigit {
    static int reverse=0;
    static void reverseDigit(int n){
        if(n==0)
            return ;
        reverse =reverse*10+(n%10);
         reverseDigit(n/10);
    }
    public static void main(String [] args){
    reverseDigit(12345);
        System.out.println(reverse);
    }
    
}
