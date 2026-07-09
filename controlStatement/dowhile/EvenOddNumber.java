package controlStatement.dowhile;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        int i=1;
        do{
            if(i%2==0){
                System.out.println("Even number = "+i);
            }else{
                System.out.println("Odd number = "+i );
            }
            i++;

        }while(i<=num);
    }
    
}
