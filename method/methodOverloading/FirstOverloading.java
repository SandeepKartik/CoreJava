package methodOverloading;

public class FirstOverloading {
    void show(){
        System.out.println("No Parameter ");
    }
    void show(int a ){
        System.out.println("It have an integer : "+a);
    }
    void show(int b,int  c){
        System.out.println(b+c); 
    }
    public static void main(String[] args){
        FirstOverloading f=new FirstOverloading();
        f.show();
        f.show(10);
        f.show(10,20);
    }
    
}
