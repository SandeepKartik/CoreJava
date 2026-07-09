package controlStatement.forstatement.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
/*

Output ::

A
AB
ABC
ABCD
ABCDE


*/