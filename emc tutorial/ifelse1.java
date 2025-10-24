
import java.util.Scanner;

class ifesle1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num > 90) {
            System.out.println("Macbook");
        } else if (num > 60) {
            System.out.println("Iphone");
        } else {
            System.out.println("Video game");
        }
    }
}
