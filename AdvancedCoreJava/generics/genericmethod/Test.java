package AdvancedCoreJava.generics.genericmethod;

public class Test {
    public static <T> void print(T value){
        System.out.println(value);
        
    }
    public static void main(String[] args) {
      print("sam");
      print(101);
      print(10.55);

    }
    
}
