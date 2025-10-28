
import java.util.Scanner;

class arr1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[5];
        System.out.println("Enter your scores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score[" + i + "] : ");
            score[i] = scan.nextInt();
        }
        System.out.println("Array elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("score[" + i + "]=" + score[i]);
        }
    }
}
