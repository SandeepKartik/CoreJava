package ternaryOperator;

public class LargestBetweenThreeNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int largest = (a > b)
                        ? (a > c ? a : c)
                        : (b > c ? b : c);

        System.out.println("Largest = " + largest);
    }
    
}
