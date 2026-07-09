package controlStatement.whileloop;

public class EvenOddNumber {
    public static void main(String[] args) {
        int i=0;
        int count=0;
        int count1=0;
        while(i<=20){
            if(i%2==0){
                count++;
                System.out.println("Even Number : "+i);
            }else{
                count1++;
                System.out.println("Odd Number : "+i);
            }
            i++;
        }
        System.out.println("Total Even Number : "+count);
        System.out.println("Total count Number : "+count1);
        
    }
    
    
}
