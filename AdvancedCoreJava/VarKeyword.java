package AdvancedCoreJava;

public class VarKeyword {
    void add(){
        var x=10;
        var y=20.20;
        var z=x+y; // compile time decide it var never exist it changed in int, String, etc during compile 
        System.out.println("Add of two number : "+z);
        System.out.println("This is the example of var keyword");
    }
    public static void main(String[] args) {
        var v=new VarKeyword();
        v.add();
    }
   
    
}
