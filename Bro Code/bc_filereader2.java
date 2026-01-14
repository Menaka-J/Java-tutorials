
import java.io.FileReader;

class bc_filereader2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        int content;

        try (FileReader fr = new FileReader(path);) {

            content = fr.read(); //read ascii of char in file

            while (content != -1) {
                System.out.println((char)content);
                content = fr.read();
            }
        } catch (Exception e) {
            System.out.println("OOPS! Something went wrong");
        } finally {
            System.out.println("Program ended");
        }

    }
}
