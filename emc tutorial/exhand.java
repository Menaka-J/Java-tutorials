
import java.util.InputMismatchException;
import java.util.Scanner;

class exhand {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int res=0;

        try {
            res = num1 / num2;
        } catch (InputMismatchException e) {
            System.out.println("error:");
            System.out.println(e);
        }

    }
}

