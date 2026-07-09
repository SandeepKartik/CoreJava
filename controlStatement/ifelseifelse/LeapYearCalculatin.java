package controlStatement.ifelseifelse;

import java.util.Scanner;

public class LeapYearCalculatin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your year : " );
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Leap Year "+year);
        }else if(year%100==0){
            System.out.println("Not a Leap year "+year);
        }else if(year % 4==0){
            System.out.println("Leap year "+year);
        }else{
            System.out.println("Not a Leap Year ");
        }
    }
    
}
