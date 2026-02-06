
import java.util.ArrayList;
import java.util.Iterator;

class arraylist {

    static void display(ArrayList<String> list) {

        //for loop using "get(ind)"
        // for (int i = 0; i < list.size(); i++) { //size()
        //     System.out.println(list.get(i));
        // }
        // for (Object elem : list) { //for each loop
        //     System.out.println(elem);
        // }
        Iterator it = list.iterator();
        System.out.println("");
        System.out.println("Elements: ");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();

        players.add("Dhoni"); //add(ele)
        players.add("Rohit");
        players.add("Raina");
        players.add(2, "Virat"); //add(ind,ele)
        players.add(1, "Bumrah");

        display(players);

        //remove(ind), remove(ele)
        players.remove(2);
        players.remove("Rohit");
        players.set(1, "Jadeja");
        display(players);

        //contains(ele)
        System.out.println("Has Virat: " + players.contains("Virat"));

    }
}
