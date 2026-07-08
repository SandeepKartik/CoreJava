package controlStatement.ifelse;

import java.util.Scanner;

public class NumberDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your number : ");
        int num=sc.nextInt();
        System.out.print("Enter your divisible number : ");
        int bydivisibile=sc.nextInt();
        if(num%bydivisibile==0){
            System.out.println("The number is divisible ");
        }else{
            System.out.println(" The number is not divisible ");
        }
    }
    
}
