package controlStatement.forstatement;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        int sum=0;
        for(; num>0;){
            int digit=num%10;
            sum +=digit;
            num /=10;
        }
        System.out.println(" sum of digit = "+sum);
    }
    
}
