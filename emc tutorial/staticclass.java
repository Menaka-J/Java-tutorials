
class student {

    private static int count = 0;
    String name;
    int std;

    public student(String name, int std) {
        this.name = name;
        this.std = std;
        count++;

    }

    static int getcount() {
        return count;
    }

}

class staticclass {

    public static void main(String[] args) {
        student st1 = new student("Menaka", 12);
        student st2 = new student("Bhuvana", 12);

        System.out.println("No.of students = " + student.getcount());
    }

}
