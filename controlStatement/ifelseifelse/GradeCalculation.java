package controlStatement.ifelseifelse;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        double marks=sc.nextDouble();
        if(marks>=90 && marks <=100){
            System.out.println("Excellent ");
        }else if(marks>=75 && marks<=89){
            System.out.println("Very Good ");
        }else if(marks>=60 && marks <=74){
            System.out.println("Good ");
        }else if(marks>=35 && marks<=59){
            System.out.println("Fail ");
        }else{
            System.out.println("invalid Marks ");
        }
    }
    
}
