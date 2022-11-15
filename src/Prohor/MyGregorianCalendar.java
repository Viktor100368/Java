package Prohor;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class MyGregorianCalendar {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2021,10,30);
        d=d.withDayOfMonth(29);
        d=d.plusDays(1);
        System.out.println(d);
    }
}
