package methodOverloading;

public class VarargsInMethods {
    void sum(int... numbers){
        int total=0;
        for(int num:numbers){
            total +=num;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        VarargsInMethods v=new VarargsInMethods();
        v.sum();
        v.sum(10);
        v.sum(10,10);
        v.sum(10,10,10,10,20);
    }
    
}
