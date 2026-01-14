
import java.io.FileReader;

class bc_filereader2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Menaka\\OneDrive\\Desktop\\sample.txt";
        int content;

        // try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr);) {
        //     content = br.readLine();
        //     while (content != null) {
        //         System.out.println(content);
        //         content = br.readLine();
        //     }
        // } catch (Exception e) {
        //     System.out.println("OOPS! Something went wrong");
        // } finally {
        //     System.out.println("Program ended");
        // }
        try (FileReader fr = new FileReader(path);) {

            content = fr.read(); //read ascii of char in file

            while (content != -1) {
                System.out.println(Integer.toString(content));
                content = fr.read();
            }
        } catch (Exception e) {
            System.out.println("OOPS! Something went wrong");
        } finally {
            System.out.println("Program ended");
        }

    }
}
