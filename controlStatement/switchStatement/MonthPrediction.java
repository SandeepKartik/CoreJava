package controlStatement.switchStatement;
import java.util.Scanner;
public class MonthPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter your month number : ");
         int num=sc.nextInt();
         switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Agust");
                break;
            case 9:
                System.out.println("Septumber");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;                                            
            default:
                System.out.println("Invalid Number Entered");
                break;
         }

    }
   
    
}
