package controlStatement.dowhile;

import java.util.Scanner;

public class PrefectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for prefect : ");
        int num=sc.nextInt();
        int org_num=num;
        int sum=0;
        int i=1;
        do{
            if(num%i==0){
                sum +=i;
            }
            i++;
        }while(i<(num-1));
        if(org_num==sum){
            System.out.println(org_num+" is a prefect number");
        }else{
            System.out.println(org_num+" is not a prefect number ");
        }
    }
    
}
