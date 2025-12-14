
class bc_vararg {

    static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int ans1 = add(12, 34, 12, 12, 355, 67);
        int ans2 = add(23, 45);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
