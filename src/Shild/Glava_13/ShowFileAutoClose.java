package Shild.Glava_13;
/*
В этой программе ShowFileAutoClose оператор try с ресурсаии
применяется для автоматического закрытия файла

примечание: для выполнения этого кода требуется версия JDK 7
 */
import java.io.*;
public class ShowFileAutoClose {
    public static void main(String[] args){
        int i;
        //сначало убодиться, что имя файла указано
        if(args.length != 1) {
            System.out.println("using : ShowFileAutoClose name_file");
            return;
        }
        //Ниже оператор try с ресурсами применяется
        //сначала для открытия, ф затем для автоматического
        //закрытия файла по завершении блока этого оператора
        try(FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char)i);
            }while (i!=-1);

        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
