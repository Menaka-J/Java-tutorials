
import java.util.Arrays;

class bc_arr1 {

    public static void main(String[] args) {
        String[] players = {"MS Dhoni", "Virat Kohli", "Suresh Raina", "Ashish Nehra", "Kumar Sangakara"};
        System.out.println("\nArray lenght = " + players.length);
        System.out.println("\nArray elements:");
        for (String name : players) {
            System.out.println(name);
        }

        System.out.println("\nArray after sorting:");
        Arrays.sort(players);
        for (String name : players) {
            System.out.println(name);
        }
    }
}
