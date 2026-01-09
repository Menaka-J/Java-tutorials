
import java.util.Scanner;

class bc_nestedfor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter # of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter # of columns: ");
        int col = scan.nextInt();
        System.out.print("Enter symbol: ");
        char symbol = scan.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
