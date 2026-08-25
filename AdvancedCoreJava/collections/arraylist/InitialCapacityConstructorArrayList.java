package AdvancedCoreJava.collections.arraylist;

import java.util.ArrayList;

public class InitialCapacityConstructorArrayList {
    public static void main(String[] args) {
      ArrayList<String> name=new ArrayList<>(100); 
      System.out.println(name);
      System.out.println(name.size()); 
    }
    

    
}
