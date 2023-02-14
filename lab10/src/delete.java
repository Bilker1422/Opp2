

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class delete extends JFrame {
    JButton delete = new JButton("delete");
    JButton cancal = new JButton("Cancal");
    JTextField userName = new JTextField("Enter Your Username : ",20);
    JPasswordField pwd = new JPasswordField("Enter Your Username :",20)  ;
    JLabel title = new JLabel("delete From");
    public delete(){

        super("delete");
        setSize(300,200);
        setLayout(new FlowLayout());
        add(title);
        add(userName);
        add(pwd);
        add(delete);
        add(cancal);
        cancal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "SELECT * FROM testaaaa WHERE username = ?";
                String delete = "DELETE FROM testaaaa WHERE  username = ?";
                try{
                    Connection con = new postgres().getConnection();
                    PreparedStatement preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1,userName.getText());
                    ResultSet s= preparedStatement.executeQuery();
                    dispose();
                    if(s.next()){
                        if(s.getString("pwd").equals(pwd.getText())){
                            JOptionPane.showMessageDialog(null,"Account have been deleted","Confirmtion", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Oh it look like your Password is wrong","Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Oh it look like your Username is wrong","Error", JOptionPane.ERROR_MESSAGE);
                    }
                    s.close();
                    preparedStatement.close();
                    PreparedStatement del = con.prepareStatement(delete);
                    del.setString(1,userName.getText());
                    del.executeUpdate();
                    del.close();
                    con.close();
                    window w = new window();
                    w.start(w);
                }catch(SQLException x){
                    System.out.println(x);
                }
            }
        });
    }


}
