package Shild.Glava_19;
//Продемонстрировать применение метода findInLine()
import java.util.*;
public class FindInLineDemo {
    public static void main(String[] args){
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner conin= new Scanner(instr);
        // Найти поле возраста и вывести его содержимое
        conin.findInLine("Возраст:");
        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Ошибка!");
        conin.close();
    }
}
