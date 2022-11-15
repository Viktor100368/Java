package Horstman.Glava_5.Equals;
interface Operation{
    double getResult(double a,double b);
}
interface Printer{
    void println(String string);
}
interface Factorial{
    int getValue(int value);
}

public class Main {

    public static void main(String[] args) {
        Operation operation=(x,y)->x+y;
        System.out.println(operation.getResult(3,8));

        Printer printer =string -> System.out.println(string);
        printer.println("Hello World");

        Factorial factorial=value -> {
            int result=1;
            for(int i=1;i<=value;i++){
                result *=i;
            }
                return result;
        };
        System.out.println("factorial 5= "+factorial.getValue(5));

    }
}

