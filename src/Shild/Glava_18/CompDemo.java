package Shild.Glava_18;

import java.util.Comparator;
import java.util.TreeSet;

//class MyComp implements Comparator<String>{
//    public int compare(String a,String b){
//        String aStr,bStr;
//        aStr = a;
//        bStr = b;
//        //Выполнить сравнение в обратном порядке
//        return aStr.compareTo(bStr);
//        //return bStr.compareTo(aStr);
//    }
//    //Переопределять метод equals() не требуется
//}
public class CompDemo {
    public static void main(String [] args){
        //MyComp mc = new MyComp();
        //Создать древовидное множество типа TreeSet
        //Comparator<String> mc = (aStr,bStr)->aStr.compareTo(bStr);
        TreeSet<String> ts = new TreeSet<>((aStr,bStr)->bStr.compareTo(aStr));
        //Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        //Вывести элементы из древовидного множества

        for(String element:ts){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
