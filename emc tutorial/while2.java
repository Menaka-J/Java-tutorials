
import java.util.Random;

class while2 {

    public static void main(String[] args) {
        //running while loop until generated random number is 8
        Random rand = new Random();
        int num = 0;

        while (num != 8) {
            num = rand.nextInt(10);
            System.out.println(num);
        }
    }
}
