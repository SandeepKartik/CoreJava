package controlStatement.dowhile;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number for armstrong : ");
        int num=sc.nextInt();
        int org_number=num;
        int sum=0;
        int cube;
        do{
            int rem=num%10;
            cube=rem*rem*rem;
            sum =sum+cube;
            num /=10;
        }while(num>0);
        if(sum==org_number){
            System.out.println("The number is armstrong number : "+num);
        }else{
            System.out.println("The number is not armstrong number "+num);
        } 
    }
    
}
