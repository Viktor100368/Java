package Shild.Glava_16;
/*
Эта программа сцммирует ряд целых чисел, вводимых пользователем.
Она преобразцет строковое представление каждого числа ы целое
значение методом parseInt()
 */
import java.io.*;
public class ParseDemo {
    public static void main(String[] args) throws IOException {
        //Создать буферизированный поток чтения типа BufferedReader,
        // используя стондартный поток ввода System.in
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число , 0- для выхода.");
        do {
            str = bf.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Текущая сумма = " + sum);

        } while (i != 0);
    }
}
