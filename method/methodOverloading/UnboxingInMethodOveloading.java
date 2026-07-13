package methodOverloading;

public class UnboxingInMethodOveloading {
    void show(int a){
        System.out.println("integer");
    }
    void show(short s){
        System.out.println("Short ");
    }
    public static void main(String[] args) {
        UnboxingInMethodOveloading un=new UnboxingInMethodOveloading();
        Integer a=10;
        un.show(a);
    }
    
}
