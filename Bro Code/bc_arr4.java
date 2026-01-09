
class bc_arr4 {

    public static void main(String[] args) {
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };
        System.out.println("TELEPHONE:");
        for (char[] one : telephone) {
            for (char two : one) {
                System.out.print(two + " ");
            }
            System.out.println(" ");
        }
    }
}
