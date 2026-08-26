package AdvancedCoreJava.collections.linkedlist;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println( queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue);

    }    
}
