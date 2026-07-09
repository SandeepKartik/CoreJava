package controlStatement.dowhile;

public class InvertRightAngleTrianglePattern {
    public static void main(String[] args) {
        int i=1;
        do{
            int j=5;
            do{
                System.out.print(" *");
                j--;
            }while(j>=i);
            i++;
            System.out.println();
        }while(i<=5);
    }
    
}
/*
OutPut :--


 
 * * * * *
 * * * *
 * * *
 * *
 *


*/