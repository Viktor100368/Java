package Prohor;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class List_10_7 {
    public static void main(String[] args){
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n",d);
        func((GregorianCalendar)d.clone());
        System.out.printf("%tc\n",d);
    }
    public static void func(GregorianCalendar d){
        d.set(2016, Calendar.APRIL,24);
    }
}
