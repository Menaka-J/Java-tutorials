
class mainthread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Mainthread");
        }
    }
}

class thread2 {

    public static void main(String[] args) {
        mainthread th = new mainthread();
        th.start();
        try {
            th.join();
        } catch (Exception e) {
        }
        System.out.println("COmpleted");
    }
}
