
import java.io.FileWriter;
import java.util.Scanner;

class filewrite2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter content to save in file[type exit to exit]: ");

        try {
            FileWriter fw = new FileWriter(path);
            while (true) {
                String content = scan.nextLine();

                if (content.equals("exit")) {
                    break;
                }
                fw.write(content);
                fw.write("\n");
            }

            fw.close();
            System.out.println("Successfully written.");
        } catch (Exception e) {
            System.out.println("Error occured " + e);
        }

    }
}
