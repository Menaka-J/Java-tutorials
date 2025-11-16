
import java.io.BufferedWriter;
import java.io.FileWriter;

class filewrite3 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        String content = """
                        hey
                        how you doing
                        this is joey""";

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            fw.close();
            System.out.println("Success");

        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
