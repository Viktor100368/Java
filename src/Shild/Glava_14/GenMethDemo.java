package Shild.Glava_14;

//Продемонстрировать простой обобщенный метод
public class GenMethDemo {
    //Определить находится ли объект в массиве
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }
    public static void main(String[] args){
        //Примениить метод isIn() для целых чисел
        Integer[] nums= {1,2,3,4,5};
        if(isIn(2,nums))
            System.out.println("Число 2 содержится в массиве nums");
        if(!isIn(7,nums))
            System.out.println("Число 7 не содержится в массиве nums");
        System.out.println();
        //Применить метод isIn() для символьных строк
        String[] strs={"Один","Два","Три","Четыре","Пять"};
        if(isIn("Один",strs))
            System.out.println("Один содержится в массиве strs");
        if(!isIn("Семь",strs))
            System.out.println("Семь не содержится в массиве strs");
        //не скомпилируется ! Типы должны быть совместимыми
//        if (isIn("Два",nums))
//            System.out.println("Два содержится в массиве strs");
    }
}
