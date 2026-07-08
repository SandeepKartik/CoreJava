package controlStatement.ifstatement;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary=sc.nextInt();
        if(salary>=5000){
            System.out.println("You  are eligible for bonus");
        }
    }
    
}
