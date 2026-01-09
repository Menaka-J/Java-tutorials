
class constructor1 {

    String name;
    int age;
    int noofmatch;
    String role;

    constructor1() {
        this.name = "";
        this.age = 0;
        this.noofmatch = 0;
        this.role = "";
    }

    constructor1(String name, int age, int noofmatch, String role) {
        this.name = name;
        this.age = age;
        this.noofmatch = noofmatch;
        this.role = role;
    }

    void display() {
        System.out.println("Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("No.of matches:" + this.noofmatch);
        System.out.println("Role: " + this.role);
    }

    public static void main(String[] args) {
        constructor1 obj1 = new constructor1();
        constructor1 obj2 = new constructor1("Raina", 36, 201, "All-rounder");

        obj1.display();
        obj2.display();
    }
}
