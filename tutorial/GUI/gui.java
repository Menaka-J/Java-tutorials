import javax.swing.*;

public class gui {
    public static void main(String[] args) {

        //JFrame create a window
        JFrame frame = new JFrame();
        frame.setTitle("JFame"); //set title

        //close frame when click on 'x' else just hide it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(402,420);
        frame.setVisible(true);

    }


}
