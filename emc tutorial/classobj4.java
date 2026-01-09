
class classobj4 {

    double findarea(double rad) {
        return 3.14 * rad * rad;
    }

    double findarea(double height, double width) {
        return (2 * height * width);
    }

    public static void main(String[] args) {
        classobj4 obj = new classobj4();
        System.out.println("for circle=" + obj.findarea(5));
        System.out.println("For erctangel="+obj.findarea(10, 21));
    }
}
