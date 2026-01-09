
class InvalidAgeError extends Exception {

    public InvalidAgeError(String s) {
        super(s);
    }

}

class AgeValidater {

    void checkage(int age) {
        try {
            if (age < 0 || age > 150) {
                throw new InvalidAgeError("Your " + age + ".Your not eligible for vote");
            } else {
                System.out.println("Your eligible for vote");
            }
        } catch (InvalidAgeError e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class exhand5 {

    public static void main(String[] args) {
        AgeValidater o1 = new AgeValidater();

        o1.checkage(-3);
        o1.checkage(25);
        o1.checkage(178);
    }
}
