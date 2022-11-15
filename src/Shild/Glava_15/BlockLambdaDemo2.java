package Shild.Glava_15;
//Блочное выражение , изменяющее на обратный
// порядок следования символов в строке
interface StringFunc{
    String func(String str);
}
public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc revers = (n)->{
            String result = "";
            for(int i=n.length()-1;i>=0;i--){
                result += n.charAt(i);
            }
            return result;
        };
        System.out.print(revers.func("лямбда")+" ");
        System.out.println(revers.func("выражение"));
    }
}
