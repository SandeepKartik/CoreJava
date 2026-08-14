package AdvancedCoreJava.innerClass.anonymousInnerClass;

public class Animal2 {
    Animal2(String name){
        System.out.println(name);
    }
     void sound(){
        System.out.println("Animals make sounds ..");
    }
    
}
class Main2{
    public static void main(String[] args) {
        Animal2 a=new Animal2("Dog"){
            @Override
            void sound(){
                System.out.println("Dog Start bariking..");
            }

        };
        a.sound();
    }
}
