
import java.util.Scanner;

class bc_userio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        System.out.print("Enter your GPA : ");
        double gpa = scan.nextDouble();
        System.out.print("Are you a student [true/false] : ");
        boolean isStudent = scan.nextBoolean();
        System.out.print("Select your gender [F/M] : ");
        char gender = Character.toUpperCase(scan.next().charAt(0));

        System.out.println("Hi " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Student [true/false] : " + isStudent);
        System.out.println("Gender [F/M] :" + gender);

    }
}
