
import java.util.Scanner;

class if1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will CSK win next match? : ");
        String iswin = scan.nextLine();
        if (iswin.equals("yes")) {
            System.out.println("Whistel Podu"); 
        }else {
            System.out.println("Hope for the best");
        }

    }
}
