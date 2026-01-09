
class classobj3 {

    void ifpass(int score) {
        if (score > 50) {
            System.out.println("pass"); 
        }else {
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        classobj3 obj = new classobj3();
        obj.ifpass(76);
    }
}
