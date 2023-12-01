import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame = new JFrame();
    private JButton chooseBTN = new JButton();
    private JTable table = new JTable();
    public GUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,1500);
        frame.setLayout(new BorderLayout());
        frame.add(chooseBTN,BorderLayout.NORTH);


        frame.setVisible(true);
    }
}
