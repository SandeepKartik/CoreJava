package method;

public class ObjectReturn {
 String name = "Sam Kartik";
    // Method returning an object
    ObjectReturn getObjectReturn() {
        ObjectReturn o = new ObjectReturn();
        return o;
    }
    public static void main(String[] args) {
        ObjectReturn obj = new ObjectReturn();
        ObjectReturn result = obj.getObjectReturn();
        System.out.println(result.name);
    }
}