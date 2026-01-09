
import java.util.Scanner;

class for2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int start = scan.nextInt();
        System.out.println("Enter end number: ");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
