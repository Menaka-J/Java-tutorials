
import java.io.FileNotFoundException;
import java.io.FileWriter;

class bc_filewriter2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        String content = """
                        Hello
                        This is java
                        Java is fun""";

        try (FileWriter fw = new FileWriter(path);) {
            fw.write(content);
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("OOPS! Something went wrong.");
        }

    }
}
