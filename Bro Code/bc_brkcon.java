
class bc_brkcon {

    public static void main(String[] args) {
        System.out.println("USING BREAK TO SHOW 1-10[case 5]:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("USING CONTINUE TO SHOW 1-10:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
