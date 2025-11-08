
public class classobj {

    String name;
    int age;

    public static void main(String[] args) {
        classobj obj1 = new classobj();
        classobj obj2 = new classobj();

        obj1.name = "Vijay";
        obj1.age = 50;
        obj2.name = "Dhoni";
        obj2.age = 43;
        System.out.println("Name:" + obj1.name);
        System.out.println("Age:" + obj1.age);
        System.out.println("Name:" + obj2.name);
        System.out.println("Age:" + obj2.age);
    }
}
