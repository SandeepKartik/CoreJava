package recursion;

public class recursionDemo {
    static void printNumber(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args) {
        printNumber(1);
    }
    
}
