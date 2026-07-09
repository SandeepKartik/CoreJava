package controlStatement.whileloop;

import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The digit : ");
        int num=sc.nextInt();
        System.out.print("Enter The number to find frequency : ");
        int num2=sc.nextInt();
        int count=0;
        while (num>0) {
            int rem=num%10;
            if(rem==num2){
                count++;
            }
            num /=10;
        }
        if(count>0){
            System.out.println("Total frequency of  "+num2+" = "+count);
        }else{
            System.out.println("Enter valid Frequency ");
        }
    }
    
}
