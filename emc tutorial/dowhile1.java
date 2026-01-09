
import java.util.Scanner;

class dowhile1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println(num);
            System.out.print("Enter a number: ");
            num = scan.nextInt();
        } while (num > 0);
    }
}
