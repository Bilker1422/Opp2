

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class register extends JFrame {
    JButton register = new JButton("register");
    JButton cancal = new JButton("Cancal");
    JTextField firstName = new JTextField("Enter Your firstName : ",20);
    JTextField lastName = new JTextField("Enter Your lastName : ",20);
    JTextField userName = new JTextField("Enter Your Username : ",20);
    JPasswordField pwd = new JPasswordField("Enter Your Username :",20)  ;
    JLabel title = new JLabel("Registration From");
    public register(){

        super("Registration");
        setSize(300,200);
        setLayout(new FlowLayout());
        add(title);
        add(firstName);
        add(lastName);
        add(userName);
        add(pwd);
        add(register);
        add(cancal);
        cancal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "INSERT INTO testaaaa VALUES (?,?,?,?)";
                try{
                    Connection con = new postgres().getConnection();
                    PreparedStatement preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1,firstName.getText());
                    preparedStatement.setString(2,lastName.getText());
                    preparedStatement.setString(3,userName.getText());
                    preparedStatement.setString(4,pwd.getText());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    con.close();
                    dispose();
                    window w = new window();
                    w.start(w);
                }catch(SQLException x){
                    System.out.println(x);
                }
            }
        });
    }


}
