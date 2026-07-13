package methodOverloading;

public class AutoBoxingInMethod {
    void show(Integer a){
        System.out.println("Integer");
    }
    void show(Long a){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        AutoBoxingInMethod ab=new AutoBoxingInMethod();
        ab.show(10);
    }
    
}
