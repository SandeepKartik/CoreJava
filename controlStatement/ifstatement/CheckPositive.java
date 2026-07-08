package controlStatement.ifstatement;

import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The number "+num+" is positive ");
        }
    }
    
}
