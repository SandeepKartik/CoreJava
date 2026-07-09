package controlStatement.whileloop;

import java.util.Scanner;

public class PrintFromNto1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A Positive Number : ");
        int n=sc.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
    
}
