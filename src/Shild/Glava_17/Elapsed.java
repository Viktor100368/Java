package Shild.Glava_17;
//Измерение времени выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Измерение времени перебора от 0 до 100000000");
        //Измерить время перебора от 0 до 100000000
        start = System.currentTimeMillis();
        for(long i=0;i<100000000l;i++);
        end = System.currentTimeMillis();
        System.out.println("Время выполнения программы: "+(end-start));
    }
}
