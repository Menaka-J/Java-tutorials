
interface newclass {

    void show();
}

class lambda {

    public static void main(String[] args) {
        newclass obj = () -> {
            System.out.println("Lambda expression for interface ");
        };
        obj.show();
    }
}
