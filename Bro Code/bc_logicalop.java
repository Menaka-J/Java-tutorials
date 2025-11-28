
import java.util.Scanner;

class bc_logicalop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scan.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must contains 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username should not contain _ or space");
        } else {
            System.out.println("Welcome " + username);
        }

    }
}
