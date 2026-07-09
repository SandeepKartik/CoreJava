package controlStatement.whileloop.pattern;

public class InversTriangle {
    public static void main(String[] args) {
        int i=1;
        while (i<=5) {
            int j=5;
            while(j>=i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
            
        }
    }
    
}
/*
OutPut :-
* * * * * 
* * * * 
* * * 
* * 
* 


*/
