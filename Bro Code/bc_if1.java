
import java.util.Scanner;

class bc_if1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("*************************");
        System.out.println("        WELCOME !!!");
        System.out.println("*************************");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter lbs : ");
            double lbs = scan.nextDouble();
            double kgs = lbs * 0.453592;
            System.out.println("KGS = " + kgs);
        } else if (choice == 2) {
            System.out.print("Enter kgs : ");
            double kgs = scan.nextDouble();
            double lbs = kgs * 2.2046;
            System.out.println("LBS = " + lbs);
        } else {
            System.out.println("Invalid choice");
        }

    }
}
