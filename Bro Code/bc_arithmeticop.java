
import java.util.Scanner;

class bc_arithmeticop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your order : ");
        String ordername = scan.nextLine();
        System.out.print("Enter price : ");
        double price = scan.nextDouble();
        System.out.print("How many do you want ? : ");
        int num = scan.nextInt();

        System.out.println("Your order " + num + ordername + " cost " + price);
    }
}
