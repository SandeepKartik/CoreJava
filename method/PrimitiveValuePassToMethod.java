package method;

public class PrimitiveValuePassToMethod {
    /*int square(int n){
        n=n*n;

        System.out.println("Square of : "+n);
        return n;
    }
    public static void main(String[] args) {
        PrimitiveValuePassToMethod p=new PrimitiveValuePassToMethod();
        int x=10;
        p.square(x);
        System.out.println(x); 
    }*/
   void num(int n){
    n++;
    System.out.println(n);
    n=100;
    System.out.println(n);
   }
   public static void main(String[] args) {
    PrimitiveValuePassToMethod p=new PrimitiveValuePassToMethod();
    int x=10;
    p.num(x);
    System.out.println(x);
   }
    
}
