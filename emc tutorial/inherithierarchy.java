
abstract class player {

    String name;
    int age;
    int matches;
    String team;

    player(String name, int age, int matches, String team) {
        this.name = name;
        this.age = age;
        this.matches = matches;
        this.team = team;
    }

    abstract void role();
}

class batter extends player {

    int runs;
    double strikerate;
    double avg;
    int highscore;

    public batter(String name, int age, int matches, String team, int runs, double strikerate, double avg, int highscore) {
        super(name, age, matches, team);
        this.runs = runs;
        this.strikerate = strikerate;
        this.avg = avg;
        this.highscore = highscore;
    }

    void role() {
        System.out.println(this.name + " is Batting");
        System.out.println("Batter details: ");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Matches:" + this.matches);
        System.out.println("Team:" + this.team);
        System.out.println("Runs:" + this.runs);
        System.out.println("Strikerate:" + this.strikerate);
        System.out.println("Average:" + this.avg);
        System.out.println("Highscore:" + this.highscore);

    }

}

class bowler extends player {

    int wickets;
    double bowlstrikerate;
    double bowlavg;
    int bestfig;

    public bowler(String name, int age, int matches, String team, int wickets, double bowlstrikerate, double bowlavg, int bestfig) {
        super(name, age, matches, team);
        this.wickets = wickets;
        this.bowlstrikerate = bowlstrikerate;
        this.bowlavg = bowlavg;
        this.bestfig = bestfig;
    }

    void role() {
        System.out.println(this.name + " is Bowling");
        System.out.println("Batter details: ");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Matches:" + this.matches);
        System.out.println("Team:" + this.team);
        System.out.println("Wickets:" + this.wickets);
        System.out.println("Strikerate:" + this.bowlstrikerate);
        System.out.println("Average:" + this.bowlavg);
        System.out.println("Best figure:" + this.bestfig);
    }
}

class inherithierarchy {

    public static void main(String[] args) {
        batter b1 = new batter("Aiden markram", 30, 103, "South Africa", 2086, 140.4, 38.7, 143);
        bowler bow1 = new bowler("Jasprit Bumrah", 32, 204, "India", 290, 68.7, 15.4, 7);

        b1.role();
        bow1.role();
    }
}
