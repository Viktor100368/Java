package Shild.Glava_10;
//Продемонмтрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc(){
        //Создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");
        //добавить причину исключения
        e.initCause(new ArithmeticException("Причина"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            //Вывести исключенме верхнего уровня
            System.out.println("Перехвачено исключение: "+e);
            //Вывести исключение, послужившее причиной
            //для исключения верхнего уровня
            System.out.println("Первопричина: "+e.getCause());
        }
    }
}
