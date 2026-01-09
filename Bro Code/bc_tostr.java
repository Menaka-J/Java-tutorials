
class person {

    String name;
    int age;
    String nationality;

    public person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old and an " + nationality;
    }
}

class bc_tostr {

    public static void main(String[] args) {
        person p1 = new person("Menaka", 19, "Indian");

        System.out.println(p1);

    }
}
