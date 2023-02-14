

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {
    JLabel title = new JLabel("Welcome to My Project");
    JButton login = new JButton("Login");
    JButton register = new JButton("register");
    JButton delete = new JButton("Delete");
    JButton update = new JButton("Update");
    public window(){
        super("H");
        setSize(200,150);
        setLayout(new FlowLayout());
        add(title);
        add(register);
        add(login);
        add(delete);
        add(update);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                start(new register());
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                start(new login());
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                start(new delete());
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                start(new update());
            }
        });
    }
    public void start(JFrame w){
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLocationRelativeTo(null);
    }

}
