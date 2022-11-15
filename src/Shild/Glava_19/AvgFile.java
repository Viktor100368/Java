package Shild.Glava_19;
//Использовать класс Scanner для вычисления среднего
//из списка чисел , вводимых из файла
import java.util.*;
import java.io.*;
public class AvgFile {
    public static void main(String[] args) throws IOException{

        int count=0;
        double sum= 0.0;
        //вывести данные в файл
        FileWriter fout = new FileWriter("test.txt");
        fout.write(" 2 3,4 5 6 7,4 9,1 10,5 готово ");
        fout.close();
        FileReader fin= new FileReader("test.txt");
        Scanner scanner = new Scanner(fin);
        //Читать и суммировать числовые значения
        while(scanner.hasNext()){
            if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }
            else{
                String str = scanner.next();
                if(str.equals("готово")) break;
                else{
                    System.out.println("Ошибка формата файла.");
                    return;
                }
                //System.out.println(str);
            }
        }
        scanner.close();
        System.out.println("Среднее равно "+sum/count);
    }
}
