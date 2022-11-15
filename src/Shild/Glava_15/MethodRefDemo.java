package Shild.Glava_15;
//Функциональный интерфейс для операций с символьными строками
//interface StringFunc{
//String func(String n);
//}
//В этом интерфейсе определяется статический метод strReverse()
class MyStringOps{
    //Статический метод, изменяющий порядок
    // следования символов в строке
    static String strReverse(String str){
        String result = "";
        for(int i=str.length()-1;i>=0;i--)
            result += str.charAt(i);
        return result;
    }
}
public class MethodRefDemo {

    // В этом методе функциональный интерфейс указывается в качестве
    // типа первого его параметра. Следовательно, ему может быть передан
    // любой экземпляр этого интерфейса, включая и ссылку на метод
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args){

        String inStr ="Лямбда-выражения повышают эффективность Java";
        String outStr;
        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse,inStr);
        System.out.println("Исходная строка: "+inStr);
        System.out.println("Обращенная строка: "+outStr);
    }
}
