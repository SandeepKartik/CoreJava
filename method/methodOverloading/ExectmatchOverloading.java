package methodOverloading;

public class ExectmatchOverloading {
    void show(int a){
        System.out.println("Int");
    }
    void show(long a){
        System.out.println("Long");
    }
    void show(double a){
        System.out.println("Double ");
    }
    public static void main(String[] args) {
        ExectmatchOverloading e=new ExectmatchOverloading();
        e.show(10);
        e.show(10.10);
    }
    
}
