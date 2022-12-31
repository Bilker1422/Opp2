package lab2;

import javax.swing.*;
import java.awt.*;

public class window extends JFrame{
    private JLabel l = new JLabel("My Favorite Animal is Cat");
    private Icon img = new ImageIcon ( getClass().getResource("index.jpg"));
    public window( ) {
        super("My Favorite Animal ");
        setLayout(new FlowLayout());
        add(l);
        add(new JLabel(img));
    }
}
