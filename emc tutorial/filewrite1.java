
import java.io.FileWriter;

class filewrite1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        String content = """ 
                          Hello
                          This is my first file handling program
                          Good bye""";
        try {
            FileWriter fw = new FileWriter(path);
            fw.write(content);
            fw.close();
            System.out.println("Success");

        } catch (Exception e) {
            System.out.println("Error occured " + e);
        }
    }
}
