
import java.util.ArrayList;

class bc_arraylist {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> cricket = new ArrayList<>();

        ArrayList<String> bowler = new ArrayList();
        bowler.add("Bumrah");
        bowler.add(("Stark"));
        bowler.add("Rabada");

        ArrayList<String> batter = new ArrayList<>();
        batter.add("Virat");
        batter.add("Smith");
        batter.add("Faf");

        ArrayList<String> captain = new ArrayList<>();
        captain.add("Dhoni");
        captain.add("Pat");
        captain.add("Aiden");

        cricket.add(batter);
        cricket.add(bowler);
        cricket.add(captain);

        System.err.println(cricket);

    }
}
