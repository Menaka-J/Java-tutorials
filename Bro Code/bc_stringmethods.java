
class bc_stringmethods {

    public static void main(String[] args) {
        String name = " I love cricket   ";
        int len = name.length();
        int ind = name.indexOf("o");
        int lind = name.lastIndexOf("c");
        char Character = name.charAt(5);
        String trimmed = name.trim();
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String rep = name.replace("o", "a");
        boolean isEmpty = name.isEmpty();
        boolean isContains = name.contains("o");
        String substr = name.substring(5,8);

        System.out.println(name);
        System.out.println(len);
        System.out.println(ind);
        System.out.println(lind);
        System.out.println(Character);
        System.out.println(trimmed);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(rep);
        System.out.println(isEmpty);
        System.out.println(isContains);

    }
}
