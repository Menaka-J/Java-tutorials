
import java.util.Scanner;

class bc_ternary {

    public static void main(String[] args) {
        char choice;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        double fah = scan.nextDouble();
        System.out.println("Enter choice [c/f]: ");
        choice = scan.next().toUpperCase().charAt(0);

        double ans = (choice == 'C') ? (fah - 32) * (5.0 / 9.0) : (fah + 32) * (9.0 / 5.0);
        System.out.println("Result: " + ans);
    }
}
