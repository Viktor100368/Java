package Horstman.Glava_5.Glava_3;

import java.io.Console;
import java.util.Scanner;

//Эта программа демонстрирует консольный ввод
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Получить первую вводимую строку
        System.out.println("What is your name?");
        String name = in.nextLine();
        //Получить вторую вводимую строку
        System.out.println("How old are you?");
        int age = in.nextInt();
        //Вывести результат на консоль
        System.out.println(
                "Hello, " + name + " . Next year, you'll be " + (age + 1));
    }

}
