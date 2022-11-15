package Shild.Glava_13;
/*
Копирование файла.
Чтобы воспользоваться этой программой, укажите
имена исходного и целеваго файлов.
Например, чтобы скопировань файл first.txt в файл second.txt,
введите в командной строке следующую команду:
java CopyFile first.txt second.txt
 */
import java.io.*;
public class CopyFile {
    public static void main(String[] args){
        int i;
        FileInputStream fin =null;
        FileOutputStream fout = null;
        //Сначало убедиться что указаны имена обоих файлов
        if(args.length !=2){
            System.out.println("Использование : CopyFile откуда куда");
            return;
        }
        //копировать файл
        try{
            //попытка открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i != -1)
                    fout.write(i);
                }while(i!=-1);
        }catch (IOException e){
            System.out.println(e);
        }finally {

        try{
            if(fin != null)
                fin.close();
        }catch (IOException e2) {
            System.out.println(e2);
        }
        try{
            if(fout != null)
                fout.close();
        }catch (IOException e){
            System.out.println(e);
        }
        }
    }
}
