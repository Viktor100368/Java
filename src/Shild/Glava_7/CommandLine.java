package Shild.Glava_7;
//вывести все элементы командной строки
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i <args.length;i++)
            System.out.println("args["+i+"]"+args[i]);
    }
}
