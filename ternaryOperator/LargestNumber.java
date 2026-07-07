package ternaryOperator;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Your Secound Number : ");
        int num2=sc.nextInt();
        String result=((num1>num2)?"Number first  is gratter":"number secound is gratter ");
        System.out.println(result);
    }
    
}
