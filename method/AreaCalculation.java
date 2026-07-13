package method;

public class AreaCalculation {
    double PI=3.147;
    double area(double r){
         return PI*r*r;
    }
    public static void main(String[] args) {
        AreaCalculation ac=new AreaCalculation();
        int a=10;
        double result=ac.area(a);
        System.out.println(result);
    }

    
}
