package Operators.BitwiseOrOperator;

import java.util.Scanner;

public class OutPutOfBitwiseOrOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter your secound number : ");
        int num2=sc.nextInt();
        int result=(num1|num2);
        System.out.println("The result of Or Operator : "+result);
    }
    
}
