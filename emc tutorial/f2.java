
import java.util.Scanner;

class f2{
    public static void main(String[] args) {
        int x,y,z,sum,mul;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y=scan.nextInt();
        z = scan.nextInt();
        sum = x+y+z;
        mul = x*y*z;
        System.out.println("Result = "+ mul/sum);
    }
}