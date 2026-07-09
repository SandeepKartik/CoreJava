package controlStatement.ifelseifelse;

import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double result;
        System.out.print("Enter Your Income : ");
        double income=sc.nextDouble();
        if(income>=1500000){
             result=((income*30)/100);
            System.out.println("Total result : "+result);
        }else if(income>=1000000 && income<1500000){
            result=((income*20)/100);
            System.out.println("Total tax : "+result);
        }else if(income>=500000 && income<1000000){
            result=((income*10)/100);
            System.out.println("Total tax : "+result);
        }else{
            System.out.println("No result ");
        }
    }
    
}
