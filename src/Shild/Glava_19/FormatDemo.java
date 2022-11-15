package Shild.Glava_19;
//Очень простой пример применения класса Formatter
import java.util.*;
public class FormatDemo {
    public static void main(String[] args){
       Formatter fmt = new Formatter();
        fmt.format("Форматоровать %s просто %d %f", "Средствами Java",10,98.6);
        System.out.println(fmt);
        fmt.close();
    }
}
