package courseOnLine.myLambda;

public class LambdaAsArgumentDemo {
    static String stringOp(StringFunc sf,String s){
        return sf.strFunc(s);
    }

    public static void main(String[] args) {
        String inStr="лямбда-выражение повыщают эффективность Java";
        String outStr;
        outStr=stringOp((st) -> st.toUpperCase(),inStr);
        System.out.println("исходная строка "+inStr);
        System.out.println("Здесь строка приводится к верхнему регистру");
        System.out.println(outStr);
        System.out.println("А здесь из строки выбрасываются пробелы");

        StringFunc hyphenDel=(str)->{
            String string="";
            for(int i=0;i<inStr.length();i++){
                if(inStr.charAt(i)!=' '){
                    string += inStr.charAt(i);
                }
            }
            return string;
        };
        System.out.println(stringOp(hyphenDel,inStr));
        System.out.println("А здесь выводится перевернутая строка");
        StringFunc reverse=((str)->{
            String string="";
            for(int i=inStr.length()-1;i>=0;i--){
                string += inStr.charAt(i);
            }
           String ss=string.toUpperCase();
            return ss;
        });
        System.out.println(stringOp(reverse,inStr));

    }

}
