package Prohor;

import java.util.Date;

public class List_11_Date {




    public static void main(String[] args){
        Date d1 = newDate();
        System.out.println(d1);
        Date d2 = newDate(d1, 124587L);
        System.out.println(d1);
        System.out.println(d2);
    }


    public static Date newDate(){
        Date d =  new Date();
        return d;
    }
    public static Date newDate(Date d, long t){
        Date d2 = (Date) d.clone();
        d2.setTime(t);
        return d2;
    }
}
