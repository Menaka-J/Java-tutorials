
class Student {

    String name;
    int age;
    double gpa;
    int[] marks = new int[5];

    public Student(String name, int age, double gpa, int[] marks) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.marks = marks;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Marks: ");
        for (int mark : this.marks) {
            System.out.print(mark + " ");
        }

    }
}

class bc_obj {

    public static void main(String[] args) {
        Student s1 = new Student("Menaka", 19, 9.4, new int[]{98, 97, 96, 100, 99});
        Student s2 = new Student("Siva", 20, 9.4, new int[]{100, 98, 87, 89, 88});

        s1.display();
        s2.display();
    }
}
