
class wordrev {

    static void rev_word(String sentence) {

        for (String word : sentence.split("\\s+")) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        rev_word("wicked is good");
    }
}
