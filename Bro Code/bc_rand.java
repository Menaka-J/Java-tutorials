
import java.util.Random;

class bc_rand {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean isHeads = rand.nextBoolean();
        System.out.println("Your choice is [heads] : " + isHeads);
    }
}
