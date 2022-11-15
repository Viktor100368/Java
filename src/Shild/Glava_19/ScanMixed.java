package Shild.Glava_19;
//Использовать класс Scanner для чтения разнотипных данных из файла
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.io.*;
public class ScanMixed {
    public static void main(String[] args)throws IOException{
        int i;
        double d;
        boolean b;
        String str;
        //Вывести данные в файл
        FileWriter fout = new FileWriter("test.txt");
        fout.write("Тестирование Scanner 10 12.2 один true два false");
        fout.close();
        FileReader fin = new FileReader("test.txt");
       try(Scanner src = new Scanner(fin)) {
           //Читать данные до конца файла
           while (src.hasNext()) {
               if (src.hasNextInt()) {
                   i = src.nextInt();
                   System.out.println("int: " + i);
               } else if (src.hasNextDouble()) {
                   d = src.nextDouble();
                   System.out.println("double: " + d);
               } else if (src.hasNextBoolean()) {
                   b = src.nextBoolean();
                   System.out.println("boolean: " + b);
               } else {
                   str = src.next();
                   System.out.println("String: " + str);
               }
           }
       }
       // src.close();
    }
}
