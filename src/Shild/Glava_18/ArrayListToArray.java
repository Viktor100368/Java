package Shild.Glava_18;
//Преобразовать списочный массив MyArrayList в обычный массив
import java.util.*;
public class ArrayListToArray {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<Integer> al =new ArrayList<>();
        //ввести элементы в списочный массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое списочного массива al: "+ al);
        //Получить обычный массив
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
        //Суммировать элементы массива
        for (int i:ia) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Сумма равна "+ sum);
    }
}
