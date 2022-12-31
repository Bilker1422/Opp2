package lab1;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog(null,"Enter the first number:");
        String num2 = JOptionPane.showInputDialog(null,"Enter the second number:");
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        String msg = String.format("Sum is %d" , sum);
        JOptionPane.showMessageDialog(null,msg);
    }
}
