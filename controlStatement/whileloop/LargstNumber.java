package controlStatement.whileloop;

import java.util.Scanner;

public class LargstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        int largest=0;
        while(num>0){
            int rem=num%10;
            if(rem>largest){
                largest=rem;
            }
            num /=10;
        }
        System.out.println("The largest number = "+largest);
    }
    
}
