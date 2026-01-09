
import java.util.Scanner;

class nestedif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = scan.nextInt();
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if (salary > 20000 || age < 25) {
            System.out.println("Enter your required amount:");
            int amount = scan.nextInt();
            if (amount < 50000) {
                System.out.println("Your eligible for loan");
            } else {
                System.out.println("Sorry, loan is not available");
            }
        } else {
            System.out.println("Your not eligible for loan");
        }
    }
}
