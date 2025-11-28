
import java.util.Random;
import java.util.Scanner;

class bc_while {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess a number between 1-10: ");
        int choice = scan.nextInt();
        Random rand = new Random();
        int ans = rand.nextInt(11);
        int attempt = 0;

        while (choice != ans) {
            if (choice < ans) {
                System.out.println("Too low!! Try again!!");
            } else if (choice > ans) {
                System.out.println("Too high!! Try again!!");
            }
            choice = scan.nextInt();
            attempt++;

        }
        System.out.println("You won");
        System.out.println("Answer is " + ans);
        System.out.println("No of Attempts: " + attempt);
    }
}

