
import java.util.Scanner;

class ifelse2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        if (score <= 50) {
            System.out.println("You need to improve"); 
        }else if (score > 50 && score < 70) {
            System.out.println("Good performance"); 
        }else {
            System.out.println("Excellent performance");
        }
    }
}
