package controlStatement.whileloop;

import java.util.Scanner;

public class SquaresOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int squr=sc.nextInt();
        int i=1;
        while (i<=squr) {
            int result=(i*i);
            System.out.println("The Square of "+i+" = "+result);
            i++;
            
        }
    }
    
}
