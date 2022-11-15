package Vasilev.glava_5;

import javax.swing.*;
import java.util.Random;

public class list_5_3 {
    public static void main(String[] args) {
        int size = 10;
        Random rnd = new Random();
        int[] nums = new int[size];
        String str = "Массив случайных чисел \n|";
        for(int i=0;i<nums.length;i++){
            nums[i]=rnd.nextInt(10)+1;
            str +=nums[i]+"|";
        }
        str+="\nПроверка\n";
        for(int s:nums){
            str+=s+"|";
        }
        JOptionPane.showMessageDialog(null,str,"случайные числа",JOptionPane.PLAIN_MESSAGE);
    }
}
