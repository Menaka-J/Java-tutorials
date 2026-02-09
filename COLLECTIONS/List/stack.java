
import java.util.Iterator;
import java.util.Stack;

//push(item) -> push at top
//pop() -> return top and delete it
//peek() -> return top without deleting
//isEmpty() -> return true if empty

class stack {

    static void display(Stack list) {
        Iterator it = list.iterator();
        System.out.println("");
        System.out.println("Elements: ");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Supernatural");
        stack.push("The Vampire diaries");
        stack.push("Marvel");
        stack.push("Harry Potter");
        stack.push("Narnia");
        stack.push("Stranger Things");
        // System.out.println(stack);
        display(stack);

        if (stack.contains("Marvel")) {
            System.out.println(" Marvel present at: " + stack.search("Marvel"));
        }

        System.out.println("Peek element: " + stack.peek());
        System.out.println("Popping 2 times...");
        stack.pop();
        stack.pop();

        display(stack);

        System.out.println("Removing all elements..");
        stack.removeAllElements();
        System.out.println("Size: " + stack.size());
        System.out.println("IS empty: " + stack.isEmpty());
    }
}
