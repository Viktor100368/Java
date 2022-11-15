package Shild.Glava_13;
/*
Версия программы CopyFileAutoClose , использующая оператор try с ресурсами.
Она демонстрирует управление двумя ресурсами (в данном случае -
файдами) в одном операторе try
 */
import java.io.*;
public class CopyFileAutoClose {
    public static void main(String[] args){
        int i;
        //сначала убедиться , что оба файла заданы
        if(args.length !=2){
            System.out.println("using CopyFileAutoClose fist.txt second.txt");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
            do{
                i=fin.read();
                if(i != -1)
                    fout.write(i);
            }while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
