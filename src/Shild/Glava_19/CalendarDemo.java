package Shild.Glava_19;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args){
        String months[]={
                "Jan","Feb","Mar","Apr",
                "May","Jun","Jul","Aug",
                "Sep","Oct","Nov","Dec"
        };
        //Создать календарь, инициализируемый
        //текущими датой и временем с учетом региональных
        //настроек и часового пояса по умолчанию
        Calendar calendar = Calendar.getInstance();
        //вывести текущую дату и время
        System.out.print("Дата: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" "+calendar.get(Calendar.DATE)+" ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(calendar.get(Calendar.HOUR)+" ");
        System.out.print(calendar.get(Calendar.MINUTE)+" ");
        System.out.println(calendar.get(Calendar.SECOND));

        //Установить дату и время и вывести их
        calendar.set(Calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,29);
        calendar.set(Calendar.SECOND,22);
        System.out.print("Измененное время: ");
        System.out.print(calendar.get(Calendar.HOUR)+":");
        System.out.print(calendar.get(Calendar.MINUTE)+":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
