
abstract class Animal {

    abstract void display();
}

class dog extends Animal {

    @Override
    void display() {
        System.out.println("WOOF WOOF!!!");
    }
}

class bc_abstract {

    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
    }
}
