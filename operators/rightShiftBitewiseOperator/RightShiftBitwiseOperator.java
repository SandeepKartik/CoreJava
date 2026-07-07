package operators.rightShiftBitewiseOperator;

import java.util.Scanner;

public class RightShiftBitwiseOperator {
    public static void main(String[] args) {
        //RightShift Bitwise Operator by 2 this is know as division
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt();
        System.out.println("Enter how many you want to right shift : ");
        int a=sc.nextInt();
        System.out.println("The number is : "+(num>>a));
    }
    
}
