package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*A Logical operator Are used to construct compound condition 
        A compound  condition is a combination of several simple conditions  */
        
        int a=10; 
        int b=20;
        int c=30;
        
        // && Logical operator 
        if(c>b&&a<b){
            System.out.println("Yes");
        }
         
        // || or  Logical Operator
        if(a==10 || b==20 || c==30){
            System.out.println("Yes");
        }

        // ! Not  logical Operator 
        if(!(a==b)){
            System.out.println("Yes it is ");
        }
    }
    
}
