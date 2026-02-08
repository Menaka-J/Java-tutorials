
import java.util.Iterator;
import java.util.LinkedList;

//addFirst(item),addLast(item)
//getFirst(item), addLast(item)
//removeFirst(item), removeLast(item)

class linkedlist {

    static void display(LinkedList<Integer> list) {

        Iterator it = list.iterator();
        System.out.println("");
        System.out.println("Elements: ");
        while (it.hasNext()) {
            Object elem = it.next();
            System.out.print(elem + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<Integer> score = new LinkedList<>();

        score.addFirst(1);
        score.addFirst(3);
        score.addFirst(5);
        score.addLast(7);
        score.addLast(9);

        display(score);
        System.out.println("at first :" + score.getFirst());
        System.out.println("at last: " + score.getLast());

        score.removeLast();
        score.removeFirst();
        display(score);
    }
}
