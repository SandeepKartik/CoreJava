package method;

public class EvenOdd {
    boolean isEven(int n){
        if(n%2==0){
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
}
class Tests{
    public static void main(String[] args) {
        EvenOdd s=new EvenOdd();
        int a =21;
        System.out.println(a);
        boolean result=(s.isEven(a));
        System.out.println(result);
    }
}