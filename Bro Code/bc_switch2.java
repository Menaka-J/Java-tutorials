
import java.util.Scanner;

class bc_switch2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = scan.nextDouble();
        System.out.print("Enter operator[+,-,*,/,%]: ");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+' -> {
                System.out.println("Addition = " + (num1 + num2));
                break;
            }
            case '-' -> {
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            }
            case '*' -> {
                System.out.println("Product = " + (num1 * num2));
                break;
            }
            case '/' -> {
                System.out.println("Division = " + (num1 / num2));
                break;
            }
            case '%' -> {
                System.out.println("Remainder = " + (num1 % num2));
                break;
            }
            default -> {
                System.out.println("Invalid operator");
                break;
            }
        }
    }
}
