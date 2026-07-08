package controlStatement.ifelse;

import java.util.Scanner;

public class VotingEligibiltyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Your age is "+age+" eligible for vote ");
        }else{
            System.out.println("Your age is "+age+" you are not eligible for vote ");
        }
    }
    
}
