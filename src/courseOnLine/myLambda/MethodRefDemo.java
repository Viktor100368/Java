package courseOnLine.myLambda;
class MyStringOps{
     String strReverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+= str.charAt(i);
        }
        return result;
    }
}
public class MethodRefDemo {
    static String stringOp(StringFunc sf,String s){
        return sf.strFunc(s);
    }
    public static void main(String[] args){

         MyStringOps strOps = new MyStringOps();
        String inStr= "Лямбда-выражение повышает эффективность Java";
        String outSt;
        outSt= stringOp(strOps::strReverse,inStr);
        System.out.println("Исходная строка "+inStr);
        System.out.println("Обращенная строка "+ outSt);
    }

}
