
import java.util.Random;
import java.util.Scanner;

class bc_pro4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String[] things = {"rock", "paper", "scissors"};
        String userchoice;
        String computerchoice;
        String isAgain = "yes";

        while (isAgain.equals("yes")) {
            computerchoice = things[rand.nextInt(3)];
            System.out.print("\nEnter your choice:[rock/paper/scissors]: ");
            userchoice = scan.nextLine();
            System.out.print("System choice :" + computerchoice + "\n");
            if (userchoice.equals(computerchoice)) {
                System.out.println("It's a Draw!!!");
            } else if ((userchoice.equals("paper") && computerchoice.equals("rock")) || ((userchoice.equals("scissors") && computerchoice.equals("paper"))) || ((userchoice.equals("rock") && computerchoice.contains("scissors")))) {
                System.out.println("You won!!!");
            } else {
                System.out.println("Computer Won!!!");
            }

            System.out.print("\nWanna play again[yes/no]: ");
            isAgain = scan.nextLine().toLowerCase();

        }
    }
}
