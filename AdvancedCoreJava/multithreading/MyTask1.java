package AdvancedCoreJava.multithreading;
import java.util.*;
public class MyTask1 implements Runnable {
    @Override 
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        MyTask1 t=new MyTask1();
        Thread t1=new Thread(t);
        t1.setName("Worker 1....");
        t1.start();
        t1.run();
    }
}
