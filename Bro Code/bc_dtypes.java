
class bc_dtypes {

    public static void main(String[] args) {
        int age = 19;
        double height = 5.2;
        char gender = 'F';
        boolean isStudent = true;
        String name = "Menaka";
        int[] marks = {99, 98, 100, 96, 97};

        System.out.println("My Name is  " + name);
        System.out.println("I am " + age + "years old.");
        System.out.println("My height is " + height);
        System.out.println("I am a " + (gender == 'F' ? "Female" : "Male"));
        System.out.println("I am a " + (isStudent ? "Student" : "Not a student"));
        System.out.println("My marks are:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
