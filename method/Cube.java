package method;

public class Cube {
    int cube(int num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Cube c=new Cube();
        System.out.println(c.cube(4));
        System.out.println(c.cube(7));
        System.out.println(c.cube(10));
    }
    
}
