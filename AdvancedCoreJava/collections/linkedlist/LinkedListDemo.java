package AdvancedCoreJava.collections.linkedlist;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> l=new LinkedList<>();
        // adding elements
        l.add("Sam");
        l.addFirst("Kartik");
        l.addLast("Vishal");
        l.addLast("Kritti");
        System.out.println(l);
        // use of remove
        l.remove(0);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        // again add elements
        l.add("Sam");
        l.addFirst("Kartik");
        l.addLast("Kriti");
        // use of get
        System.out.println(l.get(0));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        // use of peek
        LinkedList<String> ls=new LinkedList<>(l);
        System.out.println(ls);
        System.out.println(ls.peekFirst());
        System.out.println(ls.peekLast());
        // use of poll
        System.out.println(ls.pollFirst());
        System.out.println(ls.pollLast());
        System.out.println(ls);

    }
    
}
