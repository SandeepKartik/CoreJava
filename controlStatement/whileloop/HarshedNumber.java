package controlStatement.whileloop;

import java.util.Scanner;

public class HarshedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for checked harshed number : ");
        int num=sc.nextInt();
        int sum=0;
        int org_num=num;
        while (num>0) {
            int rem=num%10;
            sum +=rem;
            num /=10;
        }
        if(org_num%sum==0){
            System.out.println("The number is Harshed Number ");
        }else{
            System.out.println("The number is not Harshed Number ");
        }
    }
    
}
