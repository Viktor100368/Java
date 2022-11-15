package Shild.Glava_14;

import Shild.Glava_11.Mythread;

//Пример применения обобщенного интерфейса
// Обобщенный интерфейс MinMax для определения
// минимального и максимального значений
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}
//Реализовать обобщенный интерфейс MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] o){vals = o;}
    //Возвратить минимальное значение из массива vals
    public T min(){
        T v =vals[0];
        for(int i=1;i<vals.length;i++){
            if(vals[i].compareTo(v)<0) v=vals[i];
            }
        return v;
    }
    //Возвратить максимальное значение из массива vals
    public T max(){
        T v=vals[0];
        for(int i=1;i<vals.length;i++){
            if(vals[i].compareTo(v)>0) v=vals[i];
        }
        return v;
    }
}
public class GenIFDemo {
    public static void main(String[] args){
        Integer inums[] ={3,6,2,8,6 };
        Character chs[] ={'b','r','p','w'};
        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> chob = new MyClass<>(chs);
        System.out.println("Максимальное значение в массиве inums: "+iob.max());
        System.out.println("Минимальное значение в массиве inums: "+iob.min());
        System.out.println("Максимальное значение в массиве chs: "+chob.max());
        System.out.println("Минимальное значение в массиве chs: "+chob.min());
    }
}
