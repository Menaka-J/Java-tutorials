
import java.util.Scanner;

class exhand2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = 0, fl = 0;

        try {
            res = a / b;
        } catch (Exception e) {
            fl = 1;
            System.out.println(e);
        } finally {
            if (fl != 1) {
                System.out.println("Result = " + res);
            }
        }
    }
}
