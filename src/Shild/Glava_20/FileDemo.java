package Shild.Glava_20;
//Продемонстрировать применение некоторых методов из класс File
import java.io.File;
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        File f1= new File("c:\\JavaProject\\test.txt");
        p("Имя файла: "+f1.getName());
        p("Путь: "+f1.getPath());
        p("Абсолютный путь: "+f1.getAbsolutePath());
        p("Родительский каталог: "+f1.getParent());
        p(f1.exists()?"Существует ":"Не существует");
        p(f1.canWrite()?"Доступен для записи ":
                "Не доступен для записи");
        p(f1.canRead()?"Доступен для чтения ":"Не доступен для чтения");
        p(f1.isDirectory()?"Является каталогом ":"Не является каталогом");
        p(f1.isFile()?"Является обычным файлом ":"Не является обычным файлом");
        p(f1.isAbsolute()?"Является абсолютным ":"Не является абсолютным");
        p("Размер: "+f1.length()+"байт");
    }
}
