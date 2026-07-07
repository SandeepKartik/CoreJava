package ternaryOperator;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {   
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        String result = (num % 5 == 0)
                ? "Divisible by 5"
                : "Not Divisible by 5";

        System.out.println(result);
    }
    
}
