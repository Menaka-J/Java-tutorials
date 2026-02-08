
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//add(item), add(index,item),set(index,item)
//remove(item), remove(index)
//isEmpty(), size()
//get(index), contains(items)
//indexOf(item), lastIndexOf(item)
class list {

    public static void main(String[] args) {
        List items = new ArrayList();

        items.add("MS Dhoni");
        items.add(183);
        items.add(225.3);
        items.add(true);
        items.add(3, "Cricket");
        items.set(1, 12);

        List newitems = new LinkedList();

        newitems.addAll(items);
        //printing arraylist
        System.out.println(items);

        //size()
        System.out.println("Size: " + items.size());
        //isEmpty()
        System.out.println("Is arraylist empty: " + items.isEmpty());

        //print using for each loop
        System.out.println("Items:");
        for (Object element : items) {
            System.out.println(element);
        }
        System.out.println("");

        items.remove(2);
        System.out.println("New Items:");
        for (Object element : items) {
            System.out.println(element);
        }
        System.out.println("");
        
    }
}
