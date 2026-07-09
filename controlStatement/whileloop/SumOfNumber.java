package controlStatement.whileloop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.print("Enter  A positive number for sum : ");
        int num=sc.nextInt();
        int i=0;
        while(i<=num){
            sum+=i;
            i++;

        }
        System.out.println("Total Sum = "+sum);
    }
    
}
