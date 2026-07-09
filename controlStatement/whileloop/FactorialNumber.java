package controlStatement.whileloop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for factorial : ");
        int num=sc.nextInt();
        System.out.print("Enter number to start factorial : ");
        int num1=sc.nextInt();
        int fact=1;
        while (num1<=num) {
            fact *=num1;
            num1++;
        }
        System.out.println("The Factorial number of "+num+" = "+fact);
    }
    
}
