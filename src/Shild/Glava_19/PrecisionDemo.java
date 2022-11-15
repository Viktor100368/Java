package Shild.Glava_19;
//Продемонстрировать применение спецификатора точности
import java.util.*;
public class PrecisionDemo {
    public static void main(String[] args){
        Formatter fmt = new Formatter();
        //Формат с четырьмя цифрами после запятой
        fmt.format("%.4f",123.1234567);
        System.out.println(fmt);
        fmt.close();
        //Формат с двумя цифрами после десятичной точки
        //в поле из 16 символов
        fmt= new Formatter();
        fmt.format("%16.2e",123.1234567);
        System.out.println(fmt);
        fmt.close();
        //Вывести максимум 15 символов из строки
        fmt= new Formatter();
        fmt.format("%.15s",
                "Форматировать в Java теперь очень просто.");
        System.out.println(fmt);
        fmt.close();
    }
}
