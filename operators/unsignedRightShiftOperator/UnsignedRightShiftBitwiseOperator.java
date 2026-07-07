package operators.unsignedRightShiftOperator;

import java.util.Scanner;

public class UnsignedRightShiftBitwiseOperator {
    public static void main(String[] args) {
        // Zero fill right shift operator (>>>) are used to shift the bits towards right
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt();
        System.out.println("Enter how many you want to right shift : ");
        int a=sc.nextInt();
        System.out.println("The number is : "+(num>>>a));
    }
    
}
