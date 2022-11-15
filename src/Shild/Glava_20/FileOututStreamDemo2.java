package Shild.Glava_20;

import java.io.*;


public class FileOututStreamDemo2 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes.";
        byte buf[] = source.getBytes();


        try (
                FileOutputStream f0 = new FileOutputStream("/JavaProject/file11.txt");
                FileOutputStream f1 = new FileOutputStream("/JavaProject/file12.txt");
                FileOutputStream f2 = new FileOutputStream("/JavaProject/file13.txt");
        ) {
            //Записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
            //Записать данные во второй файл
            f1.write(buf);
            //Записать данные во третий файл
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
