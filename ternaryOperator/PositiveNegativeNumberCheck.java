package ternaryOperator;

import java.util.Scanner;

public class PositiveNegativeNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num=sc.nextInt();
        System.out.println(num>0?"Positive Number ":"Negative Number ");
    }
    
}
