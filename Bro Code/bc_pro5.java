
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class bc_pro5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to countdown from : ");
        int usercnt = scan.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int cnt = usercnt;

            @Override
            public void run() {
                System.out.println(cnt);
                cnt--;
                if (cnt < 1) {
                    System.out.println("HAPPY NEW YEAR!!!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

    }
}
