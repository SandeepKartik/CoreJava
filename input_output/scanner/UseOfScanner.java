package input_output.scanner;

import java.util.Scanner;

public class UseOfScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name=sc.nextLine();
        System.out.println("You have entered ");
        System.out.println(name );
    }
    
}
