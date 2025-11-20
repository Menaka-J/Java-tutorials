
import java.util.Scanner;

class bc_if {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age  : ");
        int age = scan.nextInt();

        if (age == 0) {
            System.out.println("Your are a baby!");
        } else if (age < 0) {
            System.out.println("Your not born yet!");
        } else if (age > 60) {
            System.out.println("Your a senior!");
        } else if (age < 15) {
            System.out.println("Your a child");
        } else {
            System.out.println("Your are an adult!");
        }
    }
}
