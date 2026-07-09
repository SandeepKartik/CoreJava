package controlStatement.whileloop.pattern;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter naumber for fibonacci series : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=1;
        while (count<=num) {
            System.out.println("Fibonacci is = "+a);
            int next=a+b;
            a=b;
            b=next;
            count++;
            
        }

    }
    
}
