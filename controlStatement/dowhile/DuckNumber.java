package controlStatement.dowhile;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbr : ");
        int num=sc.nextInt();
        int org_num=num;
        int count=0;
        do{
            int rem=num%10;
            if(rem==0){
                count++;
            }
            num /=10;
        }while(num>0);
        if(count>0){
            System.out.println(org_num+" is a Duck Number ");
        }else{
            System.out.println(org_num+" is  Not a dock number ");
        }
    }
    
}
