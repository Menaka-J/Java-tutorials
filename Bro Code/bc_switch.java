
import java.util.Scanner;

class bc_switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter today day : ");
        String day = scan.nextLine().toLowerCase();
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> {
                System.out.println("It's weekday 😢");
                break;
            }
            case "saturday", "sunday" -> {
                System.out.println("It's weekend😃");
            }
            default -> {
                System.out.println("Invalid day");
            }
        }
    }
}
