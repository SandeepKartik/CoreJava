package recursion;

public class Power {
    static int power(int base ,int exponent){
        if(exponent==0)
            return 1;
        return (base*power(base, exponent-1)); 
    }
    public static void main(String[] args) {
        int result=power(2, 4);
        System.out.println(result);
    }
    
}
