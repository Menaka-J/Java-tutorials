
import java.util.Scanner;

class bc_for {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter seconds to set counter : ");
        int num = scan.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Error occured");
            }
        }
        System.out.println("HAPPY NEW YEAR!!!");
    }
}
