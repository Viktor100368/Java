package Horstman.Glava_5.Glava_3;

import java.util.Arrays;
import java.util.Scanner;

//В этой программе деммонстрируется обращение с массивами
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k=in.nextInt();
        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();
        //Заполнить массив числами 1 2 3....n
        int[] number = new int[n];
        for(int i=0;i<number.length;i++){
            number[i]=i+1;
        }
        //выбрать к номеров и ввести их во второй массив
        int[] result = new int[k];
        for(int i=0;i<result.length;i++){
            //Получить случайный индекс в пределах от 0 до n - 1
            int r = (int)(Math.random()*n);
            //Выбрать элемент из произвольного места
            result[i]= number[r];
            //Переместить последний элемент в произвольное место
            number[r]= number[n-1];
            n--;
        }
        //Вывести отсортированный массив
        Arrays.sort(result);
        System.out.println(
                "Bet the following combginftion. It' ll make you rich!"
        );
        for(int r:result)
            System.out.println(r);
    }
}
