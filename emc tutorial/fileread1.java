
import java.io.FileReader;

class fileread1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";

        try (FileReader fr = new FileReader(path)) {
            int content = fr.read();
            while (content != -1) {
                System.out.print((char) content);
                content = fr.read();
            }
            fr.close();
            System.out.println("Success");

        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
