
import java.util.Scanner;

class for3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scan.nextInt();
        System.out.println("Enter end: ");
        int end = scan.nextInt();
        int evencnt = 0, oddcnt = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evencnt++;
            } else {
                oddcnt++;
            }
        }
        System.out.println("Even count = " + evencnt);
        System.out.println("Odd count = " + oddcnt);
    }
}
