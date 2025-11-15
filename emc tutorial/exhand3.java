
import java.util.Scanner;

class exhand3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        int flag = 0;

        try {
            if (age < 1) {
                flag = 1;
                throw new ArithmeticException("Age cannot be less than zero!");
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            if (flag == 0) {
                System.err.println("Your age is correct");
            }

        }

    }
}
