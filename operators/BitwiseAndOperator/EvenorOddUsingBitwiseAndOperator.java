package operators.BitwiseAndOperator;

public class EvenorOddUsingBitwiseAndOperator {
    public static void main(String[] args) {
        int num=10;
        if((num&1)==0){
            System.out.println("Even Number "+num);
        }else{
            System.out.println("Odd Number "+num);
        }
    }
    
}
