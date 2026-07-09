package controlStatement.whileloop.pattern;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The number for prime check : ");
        int num=sc.nextInt();
        int num2=2;
        boolean is_prime=false;
        int count=0;
        while(num2<=num){
            if(num%num2==0){
                is_prime=true;
                count++;
                
            }
            num2++;
        }
        if(count==1){
            System.out.println("The number is Prime number ");
        }else{
            System.out.println("The number is not prime number ");
        }
    }
    
}
