package Shild.Glava_15;
//Обобщеннвй функциональный интерфейс
interface SomeFunc<T>{
    T func(T t);
}
public class GenericFunctionalInterfaceDemo{
    public static void main(String[] args){
        //Использавать строкавый вариант интерфейса SomeFunc
        SomeFunc<String> reverse = (str)->{
            String result="";
            int i;
            for(i=str.length()-1;i>=0;i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("После реверса: "+reverse.func("Привет паштет"));

        SomeFunc<Integer> factorial=(n)->{
            int result = 1;
            for(int i=1;i<=n;i++){
                result *=i;
            }
            return result;
        };
        System.out.println("Факториал числа "+5+ " равен "+factorial.func(5));
    }
}
