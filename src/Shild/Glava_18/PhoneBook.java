package Shild.Glava_18;
/*
Простая база данных телефонных номеров,
построенная на основе списков свойств
 */
import java.io.*;
import java.util.*;
public class PhoneBook {
    public static void main(String[] args) throws IOException{
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin= null;
        boolean changed = false;
        //Попытаться открыть файл phonebook.dat
        try{
            fin= new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException e){
            //игнорировать отсутствующий файл
        }
        //Если телефонные номера уже существуют, загрузить
        //существующие телефонные номера
        try{
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }
        //разрешить пользователю вводить новые имена и
        // номере телефонов абонентов
        do{
            System.out.println("Введите имя"+
                    "('выход' для завершения): ");
            name = br.readLine();
            if(name.equals("выход"))continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name,number);
            changed = true;
        }while(!name.equals("выход"));
        //сохранить телефонную книгу, если она изменилась
        if(changed){
            FileOutputStream fout= new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }
        //скать номер по имени абонента
        do{
            System.out.println("Введите имя для поиска"+
                    "('выход' для завершения): ");
            name = br.readLine();
            if(name.equals("выход"))continue;
            number = (String)ht.get(name);
            System.out.println(number);
        }while (!name.equals("выход"));
    }
}
