
import java.util.Scanner;

class dowhile2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ishappy = "no";

        do {
            System.out.print("Are you happy? : ");
            ishappy = scan.nextLine();
        } while (ishappy.equals("yes"));
    }
}

