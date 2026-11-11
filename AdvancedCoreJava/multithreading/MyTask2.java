package AdvancedCoreJava.multithreading;

public class MyTask2 implements  Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}
public class Main3{
    public static void main(String[] args) {
        Thread t1=new Thread(new MyTask())
        t1.setName("Worker --1..");
        t1.start();
    }
}
