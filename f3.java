
import java.util.Scanner;

class f3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String dept = scan.nextLine();
        int score = scan.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);
        System.out.println("Result = " + (double)score / 10);
    }
}
