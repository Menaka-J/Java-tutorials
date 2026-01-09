
import java.util.Scanner;

class bc_pro {

    public static void main(String[] args) {

        //BANKING PROGRAM
        double balance = 1000;
        boolean choice = true;
        System.out.println("***********************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***********************");

        while (choice) {
            System.out.println("1.SHOW BALANCE");
            System.out.println("2.DEPOSIT MONEY");
            System.out.println("3.WITHDRAW MONEY");
            System.out.println("4.EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            Scanner scan = new Scanner(System.in);
            int op = scan.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Balance = " + balance);
                    break;
                }
                case 2 -> {
                    System.out.print("How much do you want to deposit : ");
                    double amount = scan.nextDouble();
                    balance += amount;
                    break;
                }
                case 3 -> {
                    System.out.print("How much do you want to withdraw : ");
                    double amount = scan.nextDouble();
                    if (balance <= 0) {
                        System.out.println("No amount in bank");
                        System.out.println("Deposit to wothdraw money...");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance...");
                    } else {
                        balance -= amount;
                    }

                }
                case 4 -> {
                    choice = false;
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
