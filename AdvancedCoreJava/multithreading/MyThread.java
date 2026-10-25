package AdvancedCoreJava.multithreading;
// By using  thread class 
public class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running...");
        System.out.println(Thread.currentThread().getName());
        
    }
    
}
