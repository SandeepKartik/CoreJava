package controlStatement.dowhile;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int org_num=num;
        int sum=0;
        int product=1;
        do{
            int rem=num%10;
            sum +=rem;
            product *=rem;
            num /=10;
        }while(num>0);
        if(num==product){
            System.out.println(org_num+" Is a spy number ");
        }else{
            System.out.println(org_num+" Is not a spy number ");
        }
    }
    
}
