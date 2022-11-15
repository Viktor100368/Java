package Shild.Glava_19;

import java.util.*;

public class TimeDateFormat {
    public static void main(String[] args){
        Formatter fmt = new Formatter();
        Calendar cal=Calendar.getInstance();
        //Вывести время в стандартном 12-часоваом формате
        fmt.format("%tr",cal);
        System.out.println(fmt);
        //Вывести все сведения о дате и времени
        fmt=new Formatter();
        fmt.format("%tc",cal);
        System.out.println(fmt);
        //Вывести только часы и минуты
        fmt = new Formatter();
        fmt.format("%tl:%tM",cal,cal);
        System.out.println(fmt);
        //Вывести название и номер месяца
        fmt = new Formatter();
        fmt.format("%tB %tb %tm",cal,cal,cal);
        System.out.println(fmt);
        fmt.close();
    }
}
