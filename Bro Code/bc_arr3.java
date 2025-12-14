
import java.util.Scanner;

class bc_arr3 {

    public static void main(String[] args) {
        int[] numarr = {12, 34, 56, 78, 89, 23, 45};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = scan.nextInt();
        int ind = -1;
        for (int i = 0; i < numarr.length; i++) {
            if (key == numarr[i]) {
                ind = i;
            }
        }

        if (ind == -1) {
            System.out.println("Element not found"); 
        }else {
            System.out.println("Element found at index " + ind);
        }
    }
}
