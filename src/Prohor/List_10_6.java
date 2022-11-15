package Prohor;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class List_10_6 {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n",d);
        func1(d);
        System.out.printf("%tc\n",d);
        func2(d);
        System.out.printf("%tc\n",d);
    }
    public static void func1(GregorianCalendar d){
        d = new GregorianCalendar(2016, Calendar.APRIL,24);
    }
    public static void func2(GregorianCalendar d){
        d.set(2016,Calendar.APRIL,24);
    }
}
