
import java.util.Scanner;

class arr4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array[" + i + "]:");
            array[i] = scan.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }

        System.out.println("Middle element = " + array[size / 2]);
    }
}
