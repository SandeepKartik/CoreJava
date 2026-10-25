package AdvancedCoreJava.multithreading;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        MyTask task=new MyTask();
        Thread t=new Thread(task);
        t.run();
        t.start();
    }
}
