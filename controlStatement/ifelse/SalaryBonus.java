package controlStatement.ifelse;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary=sc.nextInt();
        if(salary>=50000){
            System.out.println(" You are eligible for bonus");
        }else{
            System.out.println("You are not eligible for bonus");
        }
    }
    
}
