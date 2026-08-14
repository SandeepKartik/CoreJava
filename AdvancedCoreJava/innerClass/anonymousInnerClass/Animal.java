package AdvancedCoreJava.innerClass.anonymousInnerClass;

public class Animal {
    void sound(){
        System.out.println("Animal makes sound : ");
    }
    
}
class Main{
    public static void main(String[] args) {
    Animal a=new Animal(){
        @Override
        void sound(){
            System.out.println("Dog start barking : ");
        }
    };
    a.sound();
    }
}
