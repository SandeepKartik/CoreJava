package recursion;

public class CountDigit {
    static int countdigit(int n){
        if(n ==0){
            return 0;
        }
        return 1+countdigit(n/10);
    }
    public static void main(String[] args) {
        int result=countdigit(123456167);
        System.out.println(result);
    }
    
}
