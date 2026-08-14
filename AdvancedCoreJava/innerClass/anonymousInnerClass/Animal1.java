package AdvancedCoreJava.innerClass.anonymousInnerClass;

abstract class Animal1 {
    abstract void sound();
    void eat(){
        System.out.println("Animals are eating..");
    }
}
class Main1{
    public static void main(String[] args) {
        Animal1 a=new Animal1(){
            @Override
            void sound(){
                System.out.println("Animals make sounds ..");
            }
        };
        a.eat();
        a.sound();
    }
}
