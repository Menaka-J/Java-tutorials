
class bc_formatstr {

    public static void main(String[] args) {

        int num = 12;
        char mychar = 'm';
        String name = "Menaka";
        double bignum = 9.04;
        boolean istruw = true;

        // [conversion-char ]
        System.out.printf("%d\n", num);
        System.out.printf("%c\n", mychar);
        System.out.printf("%s\n", name);
        System.out.printf("%.2f\n", bignum); //[precision]
        System.out.printf("%b", istruw);
        System.out.println("\n");
        
        // [width ] => no.of char to be written in o/p
        System.out.printf("name: %13s", name); //set min no.of chars as 13
    }
}

/*

printf() => method to control, format and display txt to console window

options =>  % [flags] [precisions] [width] [conversion-char]


 */
