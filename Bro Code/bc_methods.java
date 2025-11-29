
class bc_methods {

    static int findabs(int number) {
        if (number < 0) {
            return Math.abs(number);
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Absolute of -15 = " + findabs(-15));
        System.out.println("Absolute of 15 = " + findabs(15));
    }
}
