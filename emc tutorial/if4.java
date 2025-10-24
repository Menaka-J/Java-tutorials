
import java.util.Scanner;

class if4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number"); 
        }else {
            System.out.println("Odd number");
        }
    }
}
