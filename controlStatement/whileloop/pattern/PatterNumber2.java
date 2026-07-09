package controlStatement.whileloop.pattern;

public class PatterNumber2 {
    public static void main(String[] args) {
        int i=1;
        while (i<=5) {
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
/*
OutPut 

1
12
123
1234
12345



*/