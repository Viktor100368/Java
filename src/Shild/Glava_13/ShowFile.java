package Shild.Glava_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Отображение содержимого текстового файла.
Чтобы воспользоваться этой программай,укажите
имя файла, поторый требуется просмотреть.
Например, чтобы просмотреть файл TEST.TXT
введите в командной строке следующую команду:
java ShowFile test.txt
 */
public class ShowFile {
    public static void main(String[] args){
        int i;
        FileInputStream fin;
        //сначало убедиться, что имя файла указано
        if(args.length !=1){
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        //Попытка открыть файл
        try{
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println(e);
            return;
        }
        //теперь файл открыт и готов к чтению.
        //Далее из него читаются символы до тех пор,
        //пока не встретится признак конца файла
        try{
            do{
                i=fin.read();
                if(i != -1)
                    System.out.print((char)i);
            }while(i!=-1);
        }catch (IOException e){
            System.out.println(e);
        }
        //закрыть файл
        try{
            fin.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
