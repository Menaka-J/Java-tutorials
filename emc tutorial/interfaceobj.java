
interface newclass {

    void display();
}

class interfaceobj {

    public static void main(String[] args) {
        newclass obj = new newclass() {
            public void display() {
                System.out.println("Creating object for interface ");
            }
        };

        obj.display();
    }
}
