package Prohor;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.DOTALL;


public class MyString {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru","RU"));
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(1461518396688L);
        System.out.printf("%tc\n",c);
        System.out.println("ERA "+c.get(Calendar.ERA));
        System.out.println("YEAR "+c.get(Calendar.YEAR));
        System.out.println("MONTH "+c.get(Calendar.MONTH));
        System.out.println("APRIL "+Calendar.APRIL);
        System.out.println("WEEK_OF_YEAR "+c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH "+c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DATE "+c.get(Calendar.DATE));
        System.out.println("DAY_OF_MONTH "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("SUNDAY "+c.get(Calendar.SUNDAY));
        System.out.println("DAY_OF_WEEK_IN_MONTH "+c.get(
                Calendar.DAY_OF_WEEK_IN_MONTH
        ));
        System.out.println("AM_PM "+c.get(Calendar.AM_PM));
        System.out.println("PM "+Calendar.PM);
        System.out.println("HOUR "+c.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE "+c.get(Calendar.MINUTE));
        System.out.println("MILLISECOND "+c.get(Calendar.MILLISECOND));
        System.out.println("ZONE_OFFSET "+c.get(Calendar.ZONE_OFFSET));
        System.out.println("3*60*60*1000 "+3*60*60*1000);
        System.out.printf("%tz\n",c);
        System.out.println("DST_OFFSET "+c.get(Calendar.DST_OFFSET));

                    }
}
