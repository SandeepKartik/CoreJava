package method;

public class Max {
    int max(int a,int b){
        if(a>b){
            System.out.println("A is max value ");
            return a;
        }else{
            System.out.println("B is Max value ");
            return b;
        }
    }
    public static void main(String[] args) {
        Max m=new Max();
        int  a =10;
        int b=20;
        int result=m.max(a, b);
        System.out.println(result);
    }
}
