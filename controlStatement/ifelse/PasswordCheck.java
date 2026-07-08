package controlStatement.ifelse;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        int pass=sc.nextInt();
        int org_password=12345;
        if(pass==org_password){
            System.out.println("Your password "+pass+" This is correct you can log in.");
        }else{
            System.out.println("Your password "+pass+" is wrong you can't log in. ");
        }
    }
    
}
