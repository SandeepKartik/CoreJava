package controlStatement.ifelse;

import java.util.Scanner;

public class GratterAndSmallerNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first  number : ");
        int num = sc.nextInt();
        System.out.print("Enter your secound number : ");
        int num2 = sc.nextInt();

        if(num>num2){
            System.out.println(num+" is gratter than "+num2);
        }else{
            System.out.println(num2+" is gratter then "+num);
        }
    }
    
}
