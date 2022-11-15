package Shild.Glava_13;
/*
Отображение содержимого текстоваго файла.
Чтобы воспользоваться этой программой, укажите
имя файла, который требуется просмотреть.
Например, чтобы просмотреть файл test.txt,
введите в командной строке следующую команду:
java ShowFile test.txt
В этом варианте программы код, открываюший и получающий
доступ к файлу, заключен в один блок оператора try.
Файл закрывается в блоке оператора finaly.
 */
import java.io.*;
public class ShowFile1 {
    public static void main(String[] args){
        int i;
        FileInputStream fin = null;
        //Сначало убедиться , что имя файла указано
        if(args.length !=1){
            System.out.println("using: ShowFile name_file");
            return;
        }
        //В следующем коде сначало открывается файл, а затем
        //из него читаются символы, до тех пор , пока не встретится
        //признак конца файла
        try{
            fin= new FileInputStream(args[0]);
            do{
                i=fin.read();
                if(i!= -1)
                    System.out.println((char)i);
            }while(i != -1);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }//закрыть файл в любом случае
        finally {
            try{
            if(fin != null) fin.close();
            }catch (IOException e){
                System.out.println(e);
            }

        }
    }
}
