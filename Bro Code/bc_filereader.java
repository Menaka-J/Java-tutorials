
import java.io.BufferedReader;
import java.io.FileReader;

class bc_filereader {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        String content;

        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr);) {
            content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("OOPS! Something went wrong");
        } finally {
            System.out.println("Program ended");
        }
    }
}
