package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        /* unary Operator as a name suggest only one Operator is there act on one operand  */
        //unary minus operator(-)
        int a=5;
        System.out.println(-a);
        System.out.println(-(-a));

        // Increment Operator (++)
        int b=10;
        System.out.println(b++); //first print then increment by 1
        System.out.println(b);

        System.out.println(++b); // First increment by 1 then print  the value 


        //Decrement Operator (--)
        int c=20;
        System.out.println(c--); // frist print value then decrement by 1 
        System.out.println(c);// after Decrement 
        System.out.println(--c); // First decrement Value then print the element 
    }
    
}
