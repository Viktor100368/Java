package Shild.Glava_13;
//Чтение символьных строк с консоли средствами класса BufferedReader
import java.io.*;
public class BRReadLines {
    public static void main(String[ ] args) throws IOException{
        //Создать поток ввода типа BufferedReader,
        //используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("стоп"));
    }
}
