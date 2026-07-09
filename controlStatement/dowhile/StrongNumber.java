package controlStatement.dowhile;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int org_num=num;
        int sum=0;
        do{
            int rem=num%10;
            int fact=1;
            int i=1;
            do{
                fact*=i;
                i++;
            }while(i<rem);
            sum +=fact;
            num /=10;
        }while(num>0);
        if(org_num==sum){
            System.out.println(org_num+" is a strong number ");
        }else{
            System.out.println(org_num+" is not a strong number ");
        }
    }
    
}
