package AdvancedCoreJava.collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
       // highest order 
        pq.add(10);
        pq.offer(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.offer(60);
        System.out.println(pq);
        pq.element();
        System.out.println(pq);
    }
}
