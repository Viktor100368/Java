package Vasilev.glava_5;

import javax.swing.*;

public class list_5_7 {
    public static void main(String[] args) {
        int[] size ={3,12,4,7};
        char[][] symbs=new char[size.length][];
        char s='A';
        String txt="";
        for(int i=0;i<symbs.length;i++){
                symbs[i]= new char[size[i]];
                for(int k=0;k<symbs[i].length;k++){
                    symbs[i][k]=s;
                    s++;
                    txt+="| "+symbs[i][k]+" ";
                }
            txt +="|\n";
        }
        JOptionPane.showMessageDialog(null,txt,
                "Массив строк разной длинны",
                JOptionPane.PLAIN_MESSAGE);
    }
}
