package Vasilev.glava_2;

import javax.swing.*;

public class list_2_3 {
    public static void main(String[] args) {
        int age;
        int year;
        int birth;
        String result;
        result= JOptionPane.showInputDialog("Какой сейчас год?");
        year = Integer.parseInt(result);
        result=JOptionPane.showInputDialog("Сколько вам лет?");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null,"Вы родились в "+birth+" году");

    }
}
