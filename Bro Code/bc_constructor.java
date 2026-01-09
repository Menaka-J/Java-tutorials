
class user {

    String name;
    String username;
    int age;

    user() {
        this.name = "Not provided";
        this.username = "Not provided";
        this.age = 0;
    }

    user(String name) {
        this.name = name;
        this.username = "Not provided";
        this.age = 0;
    }

    user(String name, String username) {
        this.name = name;
        this.username = username;
        this.age = 0;
    }

    user(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

     void display() {
        System.out.println(this.name);
        System.out.println(this.username);
        System.out.println(this.age);
    }
}

class bc_constructor {

    public static void main(String[] args) {
        user n1 = new user();
        user n2 = new user("Menaka");
        user n3 = new user("Menaka", "menaka4");
        user n4 = new user("Menaka", "menaka4", 19);

        n1.display();
        n2.display();
        n3.display();
        n4.display();

    }
}
