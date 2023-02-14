

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class update extends JFrame {
    JButton Update = new JButton("Update");
    JButton get = new JButton("get");
    JButton cancal = new JButton("Cancal");
    JLabel first = new JLabel("First Name");
    JLabel last = new JLabel("Last Name");
    JLabel pwdUpdate = new JLabel("Password");
    String temp = "Enter  your username then GET";
    JTextField username = new JTextField("To get info enter ur user name ",20);
    JTextField firstName = new JTextField(temp);
    JTextField lastName = new JTextField(temp);

    JTextField pwd = new JTextField(temp) ;
    JLabel title = new JLabel("Update From");

    public update(){

        super("Update");
        setSize(260,400);
        setLayout(new BorderLayout());
        JPanel titlae = new JPanel();
        titlae.setLayout(new FlowLayout());
        titlae.add(title);

        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(username);
        bottom.add(first);
        bottom.add(firstName);
        bottom.add(last);
        bottom.add(lastName);
        bottom.add(pwdUpdate);
        bottom.add(pwd);
        bottom.add(Update);
        bottom.add(cancal);
        bottom.add(get);
        add(titlae,BorderLayout.NORTH);
        add(bottom);
        cancal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "UPDATE testaaaa SET firstname = ?, lastname = ?, pwd = ?  WHERE username = ?";
                try{
                    Connection con = new postgres().getConnection();
                    PreparedStatement preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1,firstName.getText());
                    preparedStatement.setString(2,lastName.getText());
                    preparedStatement.setString(3,pwd.getText());
                    preparedStatement.setString(4,username.getText());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    con.close();
                    dispose();
                    JOptionPane.showMessageDialog(null,"Updated" , "Confirmtion" , JOptionPane.INFORMATION_MESSAGE);
                    window w = new window();
                    w.start(w);
                }catch(SQLException x){
                    System.out.println(x);
                }
            }
        });

        get.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "SELECT * FROM testaaaa WHERE username = ? ";
                try{
                    Connection con = new postgres().getConnection();
                    PreparedStatement preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1,username.getText());
                    ResultSet s = preparedStatement.executeQuery();
                    if(s.next()){
                        firstName.setText(s.getString("firstname"));
                        lastName.setText(s.getString("lastname"));
                        pwd.setText(s.getString("pwd"));

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"User name not found" , "Error" , JOptionPane.ERROR_MESSAGE);
                    }
                    preparedStatement.close();
                    con.close();
                }catch(SQLException x){
                    System.out.println(x);
                }
            }
        });
    }


}
