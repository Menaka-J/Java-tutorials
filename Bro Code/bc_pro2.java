
import java.util.Random;
import java.util.Scanner;

class bc_pro2 {

    public static void main(String[] args) {
        //DICE ROLLER PROGRAM

        int total = 0, num;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter no.of dice: ");
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("Dice must be greater than zero");
        } else {
            for (int i = 0; i < num; i++) {
                int dice = rand.nextInt(1,7);
                display(dice);
                System.out.println("You rolled " + dice);
                total += dice;
            }
        }
        System.out.println("Score is " + total);
    }

    static void display(int num) {
        switch (num) {
            case 1 -> {
                String dice = """
                            -------
                            |      |
                            |   •  |
                            |      |
                            --------""";
                System.out.println(dice);
            }
            case 2 -> {
                String dice = """
                            -------
                            |   •  |
                            |      |
                            |   •  |
                            --------""";
                System.out.println(dice);
            }
            case 3 -> {
                String dice = """
                            -------
                            | •    |
                            |   •  |
                            |     •|
                            --------""";
                System.out.println(dice);
            }
            case 4 -> {
                String dice = """
                            -------
                            |•    •|
                            |      |
                            |•    •|
                            --------""";
                System.out.println(dice);
            }
            case 5 -> {
                String dice = """
                            -------
                            |•    •|
                            |   •  |
                            |•    •|
                            --------""";
                System.out.println(dice);
            }
            case 6 -> {
                String dice = """
                            -------
                            |•    •|
                            |•    •|
                            |•    •|
                            --------""";
                System.out.println(dice);
            }
        }
    }
}
