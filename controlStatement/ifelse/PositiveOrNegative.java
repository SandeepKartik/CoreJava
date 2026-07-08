package controlStatement.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The number "+num+" is positive");
        }else{
            System.out.println("The number "+num+" is negative");
        }
    }
    
}
