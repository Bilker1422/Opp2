package lab3.ex;

import javax.swing.*;
import java.awt.*;

public class windo extends JFrame {
    JLabel lb1 = new JLabel("This is JLabel");
    JTextField txt = new JTextField("JTextField",10);
    JPasswordField pass = new JPasswordField("JPasswordField",10);
    JButton btn = new JButton("JButton");
    JCheckBox cbx = new JCheckBox("JCheckBox");
    JRadioButton rbtn1 = new JRadioButton("JRadioButton");
    JRadioButton rbtn2 = new JRadioButton("JRadioButton");
    ButtonGroup bGrp = new ButtonGroup();
    public windo(){

        super("Advanced JFrame");
        setLayout(new FlowLayout());
        add(lb1);
        add(txt);
        add(pass);
        add(btn);
        add(cbx);
        bGrp.add(rbtn1);
        bGrp.add(rbtn2);
        add (rbtn1);
        add (rbtn2);
    }
}
