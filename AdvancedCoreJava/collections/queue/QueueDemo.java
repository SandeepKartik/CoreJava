package AdvancedCoreJava.collections.queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        // use of add method ;
        q.add(10);
        q.add(20);
        // use of offer methods 
        q.offer(10);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        // check size of queue
        System.out.println("The size is : "+q.size());
        // use of poll
        System.out.println("Use of poll methods : "+ q.poll());
        // use of remove 
        System.out.println("use of remove methods : "+q.remove());
        // use of element methods 
        System.out.println("Use of elements methods : "+ q.element());
        // use of peek methods 
        System.out.println("Use of peek : "+q.peek());
        System.out.println(q);
    }
    
}
