
import java.util.Scanner;

class bc_arr2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no.of elements: ");
        int num = scan.nextInt();
        scan.nextLine();
        String[] order = new String[num];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < order.length; i++) {
            System.out.print("Enter order[" + i + "]: ");
            order[i] = scan.nextLine();
        }

        System.out.println("\n\nArray elements: ");
        for (String name : order) {
            System.out.println(name);
        }
    }
}
