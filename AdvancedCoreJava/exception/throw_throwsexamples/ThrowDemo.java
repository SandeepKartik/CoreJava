package AdvancedCoreJava.exception.throw_throwsexamples;

public class ThrowDemo {
    public static void main(String[] args) {
        int age= -15;
        if(age>0){
            throw new IllegalArgumentException("age can not be negative");
        }
        System.out.println("Valide age please");
    }
    
}
