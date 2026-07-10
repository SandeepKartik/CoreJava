public class ButterflyPattern {
    public static void main(String[] args) {
        int n=8;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( " *");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print( "  ");
            }

            for(int m=n-1;m>=i ;m--){
                System.out.print( "  ");
            }
            for(int o=1;o<=i;o++){
                System.out.print( " *");
            }
            System.out.println(); 
        }
        //lower side
         for(int p=2;p<=n;p++){
            for(int s=n;s>=p;s--){
                System.out.print( " *");
            }
            for(int q=2;q<=p;q++){
                System.out.print( "  ");
            }
             for(int s=2;s<=p ;s++){
                System.out.print( "  ");
            }
            for(int r=n;r>=p;r--){
                System.out.print( " *");
            }
            System.out.println(); 
        }
    
    }
    
}
