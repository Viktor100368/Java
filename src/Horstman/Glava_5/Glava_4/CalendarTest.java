package Horstman.Glava_5.Glava_4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        int month = date.getMonthValue();
        System.out.println(month);
        int today = date.getDayOfMonth();
        System.out.println(today);

        date=date.minusDays(today - 1);
        System.out.println(date.toString());
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);
        int value = weekday.getValue();
        System.out.println(value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<value;i++)
            System.out.print("-   ");
        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date= date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
