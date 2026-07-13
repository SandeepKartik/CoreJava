package methodOverloading;

public class AmbiguousMethod {
    void show (Integer s){
        System.out.println("Integer ");
    }
    void show(String s){
        System.out.println("String");
    }
    public static void main(String[] args) {
        AmbiguousMethod a=new AmbiguousMethod();
        String b =null;
        a.show(b);
        a.show(null);
    }
    
}
