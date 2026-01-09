
class mainthread implements Runnable {

    public void run() {
        System.out.println("Hello from main thread");
    }
}

class thread3 {

    public static void main(String[] args) {
        Runnable r = new mainthread();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
