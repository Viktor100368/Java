package Shild.Glava_19;
import java.util.*;
 class SampleRB extends ListResourceBundle{
     protected Object[][] getContents(){
         Object[][] resourse = new Object[3][2];
         resourse[0][0]="title";
         resourse[0][1]="My Program";
         resourse[1][0]="StopText";
         resourse[1][1]="Stop";
         resourse[2][0]="StartText";
         resourse[2][2]="Stop";
         return resourse;
     }
 }
class SampleRB_de extends ListResourceBundle{
    protected Object[][] getContents(){
        Object[][] resourse = new Object[3][2];
        resourse[0][0]="title";
        resourse[0][1]="Mein Program";
        resourse[1][0]="StopText";
        resourse[1][1]="Anschlag";
        resourse[2][0]="StartText";
        resourse[2][2]="Anfang";
        return resourse;
    }
}

public class LRBDemo {
     public static void main(String[] args){
         //загрузить комплект ресурсов по умолчанию
         ResourceBundle rd = ResourceBundle.getBundle("SampleRB",Locale.ENGLISH);
         System.out.println("Английская версия программы: ");
         System.out.println("Строка по ключу Title: "+
                 rd.getString("title"));
         System.out.println("Строка по ключу StopText: "+
                 rd.getString("StopText"));
         System.out.println("Строка по ключу StartText: "+
                 rd.getString("StartText"));
         //загрузить комплект ресурсов для поддержки немецкого языка
         rd = ResourceBundle.getBundle("SampleRB",Locale.GERMAN);
         System.out.println("\nНемецкая версия программы: ");
         System.out.println("Строка для ключа Title: "+
                 rd.getString("title"));
         System.out.println("Строка по ключу StopText: "+
                 rd.getString("StopText"));
         System.out.println("Строка по ключу StartText: "+
                 rd.getString("StartText"));
     }
}
