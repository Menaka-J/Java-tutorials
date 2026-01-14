
import java.util.Timer;
import java.util.TimerTask;

class bc_timer {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int cont = 1;

            @Override
            public void run() {
                System.out.println(cont);
                cont++;
                if (cont == 7) {
                    System.out.println("MS Dhoni!!!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 2000, 1000);
    }
}
