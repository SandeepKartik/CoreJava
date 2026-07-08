package controlStatement.ifelse;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number "+num+" is even number ");
        }else{
            System.out.println("The number "+num+" is odd");
        }
    }
    
}
