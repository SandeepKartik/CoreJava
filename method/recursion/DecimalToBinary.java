package recursion;

public class DecimalToBinary {
    static void decimalToBinary(int n){
        if(n==0)
            return ;
        decimalToBinary(n/2);
        System.out.println(n%2);
    }
    public static void main(String[] args) {
        decimalToBinary(13);
    }
    
}
