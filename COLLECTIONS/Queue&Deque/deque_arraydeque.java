
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class deque_arraydeque {

    static void display(Deque queue) {
        Iterator it = queue.iterator();
        System.out.println("\nQueue: ");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();

        //adding elements using add(), addFirst(), addLast(), offer(), offerFirst(), offerLast()
        queue.addFirst("Hello");
        queue.add("from");
        queue.addLast("Me");
        queue.offer("This");
        queue.offerFirst("is");
        queue.offerLast("ridiculous");
        display(queue);

        //peek()
        System.out.println("Peek first: " + queue.peekFirst());
        System.out.println("Peek last: " + queue.peekLast());
        display(queue);

        //poll()
        System.out.println("Poll first: " + queue.pollFirst());
        System.out.println("Poll last: " + queue.pollLast());
        display(queue);

    }
}
