
import java.util.Iterator;
import java.util.Vector;

class vector {

    static void display(Vector<String> list) {
        System.out.println("");
        System.out.println("Elements: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Vector<String> name = new Vector<>();

        name.addElement("Dean");
        name.addElement("Sam");
        name.add("Damon");
        name.add("Stefan");
        name.add(2, "Elena");

        display(name);
        System.out.println("AT index 3:" + name.get(3));
        System.out.println("capacity : " + name.capacity());
    }
}
