package lab3;

import javax.swing.*;
import java.awt.*;

public class window  extends  JFrame{
    private JLabel user = new JLabel("Username");
    private JTextField enterUser = new JTextField(20);
    private JLabel pwd = new JLabel("Password");
    private JTextField enterpwd = new JTextField(20);

    private JLabel coures = new JLabel("Select Your Courese");
    private JLabel major = new JLabel("Select Your Major");
    private JLabel gender = new JLabel("Select Your gender");

    private JCheckBox OPPII = new JCheckBox("OPPII");
    private JCheckBox OS = new JCheckBox("OS");
    private JCheckBox DB = new JCheckBox("DB");
    private  ButtonGroup g1  =new ButtonGroup();
    private  JRadioButton CS = new JRadioButton("CS");
    private  JRadioButton IS = new JRadioButton("IS");
    private  ButtonGroup g2  =new ButtonGroup();
    private  JRadioButton male = new JRadioButton("Male");
    private  JRadioButton female = new JRadioButton("Female");
    private JButton register = new JButton("register");
    private JButton cancel = new JButton("cancel");
    public window(){
        super("CCSIT REGISTTION");
        setLayout(new FlowLayout());
        add(user);
        add(enterUser);
        add(pwd);
        add(enterpwd);
        add(coures);
        add (OPPII);
        add (OS);
        add (DB);
        add(major);
        g1.add(CS);
        g1.add(IS);
        add(CS);
        add(IS);
        g2.add(male);
        g2.add(female);
        add(gender);
        add(male);
        add(female);
        add(register);
        add(cancel);

    }
}
