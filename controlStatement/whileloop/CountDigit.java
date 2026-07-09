package controlStatement.whileloop;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int count=0;
        int i=1;
        while (i<=num) {
            count++;
            i++;
        }
        System.out.println("Total number is : "+count);
    }
    
}
