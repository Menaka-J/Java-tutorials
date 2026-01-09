
import java.util.Scanner;

class bc_exception {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error occured");
        } finally {
            System.out.println("Program ended");
        }
    }
}
