package Shild.Glava_9;
//Пример вложеного интерфейса
//Этот класс содержит интерфейс как свой член
class A{
    //Это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
//Класс В реализует вложенный интерфейс
class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x<0 ? false: true;
    }

}
public class NestedIFDemo {
    public static void main(String[] args){
        //Использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if(!(nif.isNotNegative(-12)))
            System.out.println("Число -12 отрицательное");
    }
}
