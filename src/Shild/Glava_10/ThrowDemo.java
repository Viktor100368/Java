package Shild.Glava_10;
//Продемонстрировать применение оператора throw
public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("демонстрация");
        }catch(NullPointerException e){
            System.out.println("Исключение перехвачено в теле метода demoproc()");
            throw e;//Повторно сгенерировать исключение
        }
    }
    public static void main(String[] args){
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват: "+e);
        }
    }
}
