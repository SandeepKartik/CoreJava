package ternaryOperator;

import java.util.Scanner;

public class ChackAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        System.out.println(age>=18?"Eligible For Vote":"Not Eligible For Vote");
    }
    
}
