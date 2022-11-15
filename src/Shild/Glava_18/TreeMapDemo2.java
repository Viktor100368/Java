package Shild.Glava_18;
//Использовать компаратор для сортировки счетов
//по фамилиям вкладчиков
import java.util.*;
//Сравнить последние слова в обеих символьных строках
class TComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j,k;
        //Найти индекс символа , с которого начинается фаиилия
        i = aStr.lastIndexOf(' ');
        j= bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) //Фамилии совпадают, проверить имя и фамилию полновстю
            return aStr.compareTo(bStr);
        else
            return k;
    }
    //переопределять метод equals() не требуется
}
public class TreeMapDemo2 {
    public static void main(String[] args){
        TreeMap<String, Double> tm= new TreeMap<>(new TComp());
        //ввести элементы в древовидное отображение
        tm.put("Джон Доу" ,new Double(3434.34));
        tm.put("Том Смит" ,new Double(123.22));
        tm.put("Джейн Бейкер" ,new Double(1378.00));
        tm.put("Тод Халл" ,new Double(99.22));
        tm.put("Ральф Смит" ,new Double(-19.08));
        //получить множестао элементов
        Set<Map.Entry<String, Double>> set= tm.entrySet();
        //Выаести элементы из множества
        for(Map.Entry<String, Double> me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //Внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
                tm.put("Джон Доу ", balance +1000);
        System.out.println("Новый остаток на счете Джона Доу: "+
                tm.get("Джон Доу"));
    }
}
