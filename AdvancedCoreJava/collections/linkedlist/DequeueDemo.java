package AdvancedCoreJava.collections.linkedlist;
import java.util.LinkedList;

public class DequeueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> dequeue=new LinkedList<>();
        dequeue.addFirst(10);
        dequeue.addLast(20);
        dequeue.addLast(30);
        dequeue.addLast(40);
        dequeue.addLast(50);
        System.out.println(dequeue);
        // use of peek 
        System.out.println(dequeue.peekFirst());
        System.out.println(dequeue.peekLast());
        System.out.println(dequeue);
        // use of poll
        System.out.println(dequeue.pollFirst());
        System.out.println(dequeue.pollLast());
        System.out.println(dequeue);
    }    
}
