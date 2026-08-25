package AdvancedCoreJava.collections.arraylist;

import java.util.ArrayList;

public class CollectionConstructor {
    public static void main(String[] args) {
        ArrayList <String> list1=new ArrayList<>(100);
        list1.add("Sam");  
        list1.add("Kartik");
        list1.add("Vishal");

        ArrayList<String>name=new ArrayList<>(list1);
        System.out.println(name);


    }
   
    
}
