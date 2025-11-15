
import java.util.Scanner;

class NotEligibleError extends Exception {

    public NotEligibleError(String s) {
        super(s);
    }

}

class exhand4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = scan.nextInt();

        try {
            if (age < 18) {
                throw new NotEligibleError("Your not eligible for vote");
            }
        } catch (NotEligibleError e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (!(age < 18)) {
                System.out.println("Your eligible for vote");
            }
        }
    }
}
