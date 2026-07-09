package controlStatement.forstatement.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            char ch=(char)('A'+i-1);
            for(int j=5;j>=i;j--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
/*
Output :: 

AAAAA
BBBB
CCC
DD
E



*/