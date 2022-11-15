package Prohor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {

    printCalendarOnMonth(2021,10,LocalDate.now());
        printCalendarOnYear(LocalDate.now().getYear(), LocalDate.now());

        }
    public static String[] getNameMonths(){
        return new String[]{"Январь","Февраль","Март","Апрель",
                "Май","Июнь","Июль","Август","Сентябрь","Октябрь",
                    "Ноябрь","Декабрь"};
    }

    public static String[] getNameWeeks(){
        return new String[] {"Пн","Вт","Ср","Чт","Пт","Сб","Вс"};
    }
    public static String onCenter(String s, int length, char ch) {
        if (s == null) return "";
        int sLength = s.length();
        if (length <= 0 || sLength == 0) return "";
        if (sLength == length) return s;
        if (sLength > length) return s.substring(0, length);
        int start = (length - sLength) / 2;
        int end = length - start - sLength;
        char[] arrStart = new char[start];
        char[] arrEnd = new char[end];
        Arrays.fill(arrStart, ch);
        Arrays.fill(arrEnd, ch);
        return String.valueOf(arrStart) + s +
                String.valueOf(arrEnd);
    }
    public static String onCenter(String s, int length) {
        return onCenter(s, length, ' ');
    }

    public static void printCalendarOnMonth(
            int year, int month, LocalDate currDay) {
        if (currDay == null || month < 1 || month > 12)
            return;
        LocalDate d = LocalDate.of(year, month, 1);
// Выводим название месяца и год
        String[] nameMonths = getNameMonths();
        System.out.println(onCenter(
                nameMonths[d.getMonthValue() - 1], 28));
// Выводим названия дней недели
        String[] nameWeek = getNameWeeks();
        for (int i = 0; i < nameWeek.length; i++) {
            System.out.print(onCenter(nameWeek[i], 4));
        }int indent = 0;
        DayOfWeek firstDayOfWeek = DayOfWeek.MONDAY;
        LocalDate d2 = d.withDayOfMonth(1);
        DayOfWeek currDayOfWeek = d2.getDayOfWeek();
        while (firstDayOfWeek != currDayOfWeek) {
            indent++;
            d2 = d2.minusDays(1);
            currDayOfWeek = d2.getDayOfWeek();
        }
        if (indent != 0) System.out.println();
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
// Выводим числа месяца
        for (int i=1, j=d.lengthOfMonth()+1; i < j; i++) {
// Если текущий день недели равен первому дню,
// то вставляем символ перевода строки
            if (d.withDayOfMonth(i).getDayOfWeek()
                    == firstDayOfWeek) System.out.println();
// Выводим число
            System.out.printf("%3d", i);
// Если текущий день, то помечаем его символом *
            if (d.withDayOfMonth(i).equals(currDay))
                System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }
    public static void printCalendarOnYear(
            int year, LocalDate currDay) {
        System.out.println(
                onCenter("Календарь на " + year + " год", 28));
        for (int i = 1; i <= 12; i++) {
            System.out.println();
            printCalendarOnMonth(year, i, currDay);
        }
    }
}

