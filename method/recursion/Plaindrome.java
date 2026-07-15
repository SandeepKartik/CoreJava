package recursion;

public class Plaindrome {
    static int reverse=0;
    
    static void plaindrome(int n){
        
        if(n==0)
            return ;
        reverse=reverse*10+(n%10);
        
         plaindrome(n/10);
    }
    public static void main(String[] args) {
        int org_num=121;
        plaindrome(org_num);
        if(reverse==org_num){
            System.out.println("Plaindrome ");
        }else{
            System.out.println("Not Plaindrome number ");
        }
        
    }
    
}
