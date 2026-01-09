
class ping extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ping!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}

class pong extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pong!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class thread1 {

    public static void main(String[] args) {
        ping ping1 = new ping();
        pong pong1 = new pong();

        ping1.start();
        pong1.start();
    }
}
