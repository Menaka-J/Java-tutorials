
class driver {

    String name;
    int age;
    int wins;
    int poles;

    driver(String name, int age, int wins, int poles) {
        this.name = name;
        this.age = age;
        this.wins = wins;
        this.poles = poles;
    }
}

class ferraridriver extends driver {

    String team = "Ferrari";
    private String strategy = "Box Box";

    public ferraridriver(String name, int age, int wins, int poles) {
        super(name, age, wins, poles);
    }

    public void display() {
        System.out.println("Team: " + team);
        System.out.println("Name: " + this.name);
        System.err.println("Age: " + this.age);
        System.out.println("Wins : " + this.wins);
        System.out.println("Poles : " + this.poles);
    }
}

class inheritsingle {

    public static void main(String[] args) {
        ferraridriver d1 = new ferraridriver("Charles Leclerc", 27, 8, 29);
        d1.display();
        System.out.println(d1.name);
    }
}
