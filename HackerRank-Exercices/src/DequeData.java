import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeData {

    public static void main(String[] args) {
//        Deque<String> deque
//                = new ArrayDeque<>();
//
//        // We can add elements to the queue
//        // in various ways
//
//        // Add at the last
//        deque.add("Element 1 (Tail)");
//
//        // Add at the first
//        deque.addFirst("Element 2 (Head)");
//
//        // Add at the last
//        deque.addLast("Element 3 (Tail)");
//
//        // Add at the first
//        deque.push("Element 4 (Head)");
//
//        // Add at the last
//        deque.offer("Element 5 (Tail)");
//
//        // Add at the first
//        deque.offerFirst("Element 6 (Head)");
//
//        System.out.println(deque + "\n");
//
//        // We can remove the first element
//        // or the last element.
//        deque.removeFirst();
//        deque.removeLast();
//        System.out.println("Deque after removing "
//                + "first and last: "
//                + deque);
        //----------------------------------------------------------
//        Deque<String> dq
//                = new ArrayDeque<String>();
//
//        // add() method to insert
//        dq.add("For");
//        dq.addFirst("Geeksa");
//        dq.addLast("Geeks");
//
//        System.out.println(dq);
//
//        System.out.println(dq.pop());
//        System.out.println(dq);
//        System.out.println(dq.poll());
//        System.out.println(dq);
//        System.out.println(dq.pollFirst());
//        System.out.println(dq);
//        System.out.println(dq.pollLast());
//        dq.poll();
//        System.out.println(dq);
        //-----------------------------------------------------------------
        // Initializing an deque
        Deque<Integer> de_que
                = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);
    }
}
