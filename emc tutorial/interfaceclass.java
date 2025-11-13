
interface Batter {

    static void role() {
        System.out.println("Batter is batting...");
    }

}

interface Bowler {

    static void role() {
        System.out.println("Bowler is bowling...");
    }
}

class Allrounder implements Batter, Bowler {

    void role() {
        System.out.println("Do both batting and bowling");
    }
}

class interfaceclass {

    public static void main(String[] args) {
        Allrounder p1 = new Allrounder();
        p1.role();

        Bowler.role();
    }
}
