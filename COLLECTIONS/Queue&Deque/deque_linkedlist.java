
import java.util.Deque;
import java.util.LinkedList;

class deque_linkedlist {

    public static void main(String[] args) {
        Deque queue = new LinkedList();

        queue.add("hi");
        queue.addFirst(1);
        queue.addLast(12.44);
        queue.offer(2);
        queue.offerFirst("sucks");
        queue.offerLast("java");
        

        System.out.println("Linked list: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Peek first: " + queue.peekFirst());
        System.out.println("Peek last: " + queue.peekLast());

        System.out.println("Linked list: " + queue);

        System.out.println("Poll : " + queue.poll());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Poll first: " + queue.pollFirst());
        System.out.println("Poll last: " + queue.pollLast());

        System.out.println("Linked list: " + queue);
    }
}
