package controlStatement.whileloop;

import java.util.Scanner;

public class PlaindronNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for plaindrome : ");
        int num=sc.nextInt();
        int org_num=num;
        int reverse=0;
        while (num>0) {
            int rem=num%10;
            reverse =reverse*10+rem;
            num /=10;
        }
        if(org_num==reverse){
            System.out.println("The number is plaindron ");
        }else{
            System.out.println("The number is not plaindron ");
        }
    }
    
}
