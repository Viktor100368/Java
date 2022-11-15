package Shild.Glava_15;
//Пример захвата локальной переменной из объемлющей области действия
interface MyFuncL{
    int func(int n);
}
public class VarCapture {
    static int aa = 0;
    public static void main(String[] args){
        //Локальная переменная , которая может быть захвачена
        final int num = 10;
        MyFuncL myLambda = (n)->{
            //Такое применение переменной num допустимо, поскольку
            // она не видоизменяется
            int v = num +n;
            //Но следующая строка кода недопустима, помкольку в ней
            // предпринимается попытка видоизменить значение переменной num
            // num++;
            aa=v;
            return v;
        };
        // И следующая строка кода приведет к ошибке, поскольку в ней
        // нарушается действительно завершенное состояние переменной num
         //num = 9;
        System.out.println(" num= "+num);
        System.out.println("значение функции: "+myLambda.func(10));
        System.out.println("aa = "+aa);
    }
}
