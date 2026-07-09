package controlStatement.whileloop;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num=sc.nextInt();
        float sum=0;
        float count=0;
        int i=1;
        while(i<=num){
            sum +=i;
            count +=1;
            i++;
        }
        System.out.println("Total sum = "+sum);
        System.out.println("Total Count = "+count);
        float average=sum/count;
        System.out.println("The Average is : "+average);

    }
    
}
