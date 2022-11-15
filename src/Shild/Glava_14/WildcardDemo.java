package Shild.Glava_14;
//Продемонстрировать применение метасимволоа
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] ={1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно "+v);

        Double dnums[] ={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w =dob.average();
        System.out.println("Среднее значение dob равно "+w);

        Float fnums[] = {1.0f,2.0f,3.0f,4.0f,5.0f};
        Stats<Float> fob = new Stats<>(fnums);
        double x =fob.average();
        System.out.println("Среднее значение fob равно "+x);

        //Выяснить, какие массивы имеют одинаковые средние значения
        System.out.println("Среднее значение iob и dob ");
        if(iob.sameAvg(dob))
            System.out.print("равны");
        else
            System.out.print("отличаются");
        System.out.println();
        System.out.println("Средние значения iob и fob ");
        if(iob.sameAvg(fob))
            System.out.print("одинаковы");
        else
            System.out.print("отличаются");
    }
}
