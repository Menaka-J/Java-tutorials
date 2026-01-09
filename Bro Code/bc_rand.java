
import java.util.Random;

class bc_rand {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean isHeads = rand.nextBoolean();
        System.out.println("Your choice is [heads] : " + isHeads);

        int randnum = rand.nextInt(100) + 1;
        System.out.println("Your score is :" + randnum);
    }
}
