package controlStatement.whileloop;

import java.util.Scanner;

public class SmallestNumberInDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit for find smallest : ");
        int num=sc.nextInt();
        int smallest=num%10;
        while (num>0) {
            int rem=num%10;
            if(rem<smallest){
                smallest=rem;
            }
            num /=10;
        }
        System.out.println("The Smallest Number = "+smallest);
    }
    
}
