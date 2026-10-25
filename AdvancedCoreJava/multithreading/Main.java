package AdvancedCoreJava.multithreading;

public class Main {
     public static void main(String[] args) {
        MyThread t=new MyThread();
        t.run();
        t.start();
    }
}
