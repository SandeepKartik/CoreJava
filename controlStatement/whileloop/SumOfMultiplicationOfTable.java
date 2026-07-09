package controlStatement.whileloop;

import java.util.Scanner;

public class SumOfMultiplicationOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table where to start : ");
        int table=sc.nextInt();
        System.out.print("Enter the number where to table stop : ");
        int num1=sc.nextInt();
        int result;
        int sum=0;
        while (table<=num1) {
            System.out.println("The Table of "+table);
            System.out.println();
            int i =1;
            while(i<=10){
                result=table*i;
                System.out.println(i+" X "+table+" = "+result);
                sum+=result;
                i++;
            }
            System.out.println();
            table++;
            System.out.println("The sum = "+sum);
        }
    }
    
}
