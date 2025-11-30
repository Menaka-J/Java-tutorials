
class bc_overloadfunc {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Adding 2 numbers = " + add(12, 13));
        System.out.println("Adding 3 numbers = " + add(12, 13, 15));
    }
}
