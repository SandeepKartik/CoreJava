package AdvancedCoreJava;

public class VarKeyword {
    void add(){
        var x=10;
        var y=20.20;
        var z=x+y; // compile time decide it var never exist it changed in int, String, etc during compile 
        System.out.println("Add of two number : "+z);
    }
    public static void main(String[] args) {
        VarKeyword v=new VarKeyword();
        v.add();
    }
   
    
}
