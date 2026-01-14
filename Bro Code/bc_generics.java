
class wrapper<T, U> {

    T productame;
    U price;

    wrapper(T productame, U price) {
        this.productame = productame;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + this.productame);
        System.out.println("Price/count :" + this.price);
    }

}

class bc_generics {

    public static void main(String[] args) {
        wrapper<String, Integer> p1 = new wrapper<>("Shirt", 5);
        wrapper<String, Double> p2 = new wrapper<>("Coconut", 15.5);

        p1.display();
        p2.display();
    }
}
