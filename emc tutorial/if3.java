
import java.util.Scanner;

class if3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("Number is divisible by both 3 and 5"); 
        }else {
            System.out.println("Number is not divisible by both 3 and 5");
        }

    }
}
