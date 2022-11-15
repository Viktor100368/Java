package Prohor;

public class ClassDemo1 {
    public static void main(String[] args){
        Class3 c = new Class3();
        System.out.println(c.s);
    }
}
class Class3 {
    public String s="Явная инициализация";

    public Class3(){

        System.out.println(s);
        s="Конструктор";
    }
    {

        System.out.println(s);
        s="блок";
    }
}
