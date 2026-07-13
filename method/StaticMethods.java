package method;

public class StaticMethods {
    static String name ="Sam Kartik";
    static void show(){
        System.out.println(name);
    }
    
}
class Test7{
    public static void main(String[] args) {
        StaticMethods.show();
    }
}
