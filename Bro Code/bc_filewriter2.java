
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

class bc_filewriter2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        String content = """
                        Hello
                        This is java
                        Java is fun""";

        try (Scanner scan = new Scanner(System.in); FileWriter fw = new FileWriter(path); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("OOPS! Something went wrong.");
        }

    }
}
