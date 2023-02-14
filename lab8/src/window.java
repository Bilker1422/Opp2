import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {
    JButton smile = new JButton("Smule");
    face f =new face();
    int size  = 0;
    public window(){
        super("Playing with Graphics");
        setLayout(new FlowLayout());
        add(smile);
        f.setPreferredSize(new Dimension(150,150));
        add(f);
        smile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = 10;
                repaint();
            }
        });

    }

    public class face extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.fillOval(20,20,100,100);
            g.setColor(Color.BLACK);
            g.fillOval(45,45,15,15);
            g.fillOval(75,45,15,15);
            g.setColor(Color.RED);
            g.drawArc(50,85,35,size,0,-180);
        }
    }
}
