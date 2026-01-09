
import java.util.Scanner;

class arr2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score[" + i + "]: ");
            score[i] = scan.nextInt();
            sum += score[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double) sum / 5);

    }
}
