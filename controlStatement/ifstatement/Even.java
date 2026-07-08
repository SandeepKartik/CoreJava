package controlStatement.ifstatement;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number "+num+" is Even");
        }
    }
    
}
