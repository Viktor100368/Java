package Vasilev;

import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Enter a text");
        JOptionPane.showMessageDialog(null,"Вы ввели такой текст;\n"+text);
    }
}
