package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame{

    JLabel u = new JLabel("Username");
    JTextField user = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    JLabel p = new JLabel("Password");
    JButton log = new JButton("Login");
    JButton cancel = new JButton("Cancel");
    public  window(){
        super("Login Form");
        setLayout(new FlowLayout());
        add(u);
        add(user);
        add(p);
        add(pass);
        add(log);
        add(cancel);
        btnhandler handler = new btnhandler();
        log.addActionListener(handler);
        cancel.addActionListener(handler);
    }
    public class btnhandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == log){
                if (user.getText().equals("malhajri") && pass.getText().equals("1111")) {
                    JOptionPane.showMessageDialog(null,String.format("Welcome %s", user.getText()),null,JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Username or password in not correct!!!",null,JOptionPane.ERROR_MESSAGE);

                }
            }
            else if (e.getSource() == cancel){
                user.setText("");
                pass.setText("");
            }
        }
    }
}
