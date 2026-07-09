package controlStatement.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for check armstrong : ");
        int num=sc.nextInt();
        int org_num=num;
        int temp=num;
        int cube;
        int sum=0;
        while (num>0) {
            int rem=num%10;
            cube=rem*rem*rem;
            sum +=cube;
            num /=10;
        }
        if(org_num==sum){
            System.out.println("The number is Armstrong ");
        }else{
            System.out.println("The number is not Armstrong ");
        }
    }
    
}
