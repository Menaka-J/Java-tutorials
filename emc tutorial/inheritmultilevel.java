
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Wooh wooh!");
    }
}

class Puppy extends Dog {

    void sound() {
        System.out.println("Weep Weep!");
    }
}

class inheritmultilevel {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puuppy = new Puppy();

        animal.sound();;
        dog.sound();
        puuppy.sound();

    }
}
