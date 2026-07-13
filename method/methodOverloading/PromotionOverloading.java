package methodOverloading;

public class PromotionOverloading {
    void show(long a ){
        System.out.println("Long");

    }
    void show(double d){
        System.out.println("Dobule ");
    }
    public static void main(String[] args) {
        PromotionOverloading p=new PromotionOverloading();
        char c='A';
        p.show(c);
        byte b=10;
        p.show(b);
    }
    
}
