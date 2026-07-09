package controlStatement.forstatement;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number for factorial : ");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        for(;num>0;){
           int rem=num%10;
           rev =rev*10+rem;
           num /=10;
        }
         if(org_num==rev){
            System.out.println(org_num+" is a plaindrome number");
         }else{
            System.out.println(org_num+" is not a plaindrome number ");
         }
    }
    
}
