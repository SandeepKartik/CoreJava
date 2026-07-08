package controlStatement.ifelse;

import java.util.Scanner;

public class Divisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbe : ");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("The number "+num+" is divisible by 3 and 5 ");
        }else{
            System.out.println("The number "+num+" is not divisible by 3 and 5 ");
        }
    }
    
}
