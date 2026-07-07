package operators.BitwiseAndOperator;
import java.util.Scanner;
public class Powerof2UsingBitwiseAndOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt();
        if(num>0 &&(num &(num-1))==0){
            System.out.println(" The number is Power of 2");

        }else{
            System.out.println("The number is not power of 2 ");
        }
        sc.close();
    }   
}
