import java.util.*;
public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Queue: " + q);

        // PEEK to View front element
        System.out.println("Front: " + q.peek());

        // DEQUEUE to  Remove front element
        System.out.println("Deleted: " + q.poll());

        // ISEMPTY - to Check empty
        System.out.println("Is Empty: " + q.isEmpty());

        // SIZE - to Count elements
        System.out.println("Size: " + q.size());

        System.out.println("Updated Queue: " + q);

        System.out.println("Front: " + q.peek());
        System.out.println("Rear: " + ((LinkedList<Integer>)q).getLast());
    }
}
