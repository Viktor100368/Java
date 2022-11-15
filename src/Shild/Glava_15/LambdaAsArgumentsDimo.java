package Shild.Glava_15;
//Передать лямбда-выражение в качестве аргумента методу
interface StringFunc1{
    String func(String n);
}
public class LambdaAsArgumentsDimo {
    //Первый параметр этого метода имеет тип фукционального
    //интерфейса. Следовательно. ему можно передать ссылку на
    // любой экземпляр этого интерфейса. включая экземпляр,
    //создаваемый в лямбда-выражении. А второй параметр
    //обозначает оьраьатываемую символьную строку
    static String stringOp(StringFunc1 sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args){
        String inStr="Лямбда-выражения повышают эффективность Java";
        String outStr;
        System.out.println("Это исчодная строка: "+ inStr);
        //Ниже приведено простое лямбда-вырадение, преобразующее
        // в верхний регистр букв все символы исходной строки,
        // передаваемой методу stringOp()
        outStr= stringOp((str)-> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: "+ outStr);
        //А здесь передается блочное лямбда-выражение, удаляюшеее
        //пробелы из исходной символьной строки
//        outStr = stringOp((str)->{
//            String result = "";
//            for(int i=0;i<str.length();i++)
//                if(str.charAt(i) !=' ')
//                    result+=str.charAt(i);
//                return result;
//        },inStr);

        StringFunc1 stringFunc =(str)->{
            String result = "";
            for(int i=0;i<str.length();i++)
                if(str.charAt(i) !=' ')
                    result+=str.charAt(i);
                return result;
        };
        outStr = stringOp(stringFunc,inStr);
        System.out.println("Это строка с удаленными пробелами: "+outStr);
        //Конечно, можно передать и экземпляр интерфейса StringFunc,
        //созданный в предидущем лямбда-выражении. Например, после
        //следующего объявления ссылка reverse делается на экземпляр
        // интерфейса StringFrnc
        StringFunc1 reverse=(str)->{
            String result = "";
            for(int i=str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        //А теперь ссылку reverse можно передать в качестве первого
        // параметра методу stringOp()
        //since it refers to a StringFunc object.
        System.out.println("Это обращенная строка: "+ stringOp(reverse,inStr));
    }
}
