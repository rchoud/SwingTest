import javax.swing.*;

public class App {
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {

        JFrame frame = new JFrame( title: "App");
        frame.setContentPane(new: App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( width: 400, height: 400);

        frame.setVisible(true);

    }




}
