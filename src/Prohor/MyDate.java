package Prohor;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(14556145614123L));
        System.out.printf("%tc",c);

    }
    }