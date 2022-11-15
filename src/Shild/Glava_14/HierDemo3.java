package Shild.Glava_14;
//Использовать оператор instanceof в иерархии обобщенных классов
class Gen3<T>{
    T ob;
    Gen3(T o){
        ob=o;
    }
    //Возвратить объект ob
    T getOb(){
        return ob;
    }
}
//Подкласс , производный от класса Gen3
class Gen3Ex<T>extends Gen3<T>{
    Gen3Ex(T o){
        super(o);
    }
}
//Продемонстрировать последствия динамической индификации
//типов в иерархии обобщенных классов
public class HierDemo3 {
    public static void main(String[] args){
        //Создать объект типа Gen3 для целых чисел
        Gen3<Integer> iOb = new Gen3<>(88);
        //Создать объект типа Gen3Ex для целых чисел
        Gen3Ex<Integer> iOb2 = new Gen3Ex<>(99);
        //Создать объект типа Gen3Ex для символьных строк
        Gen3Ex<String>strOb2 = new Gen3Ex<>("Текст сообщений");
        //Проверить , является ли объект iOb2 какой нибудь из форм класс Gen3
        if(iOb2 instanceof Gen3<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen3");
        //Проверить , является ли объект iOb2 какой нибудь из форм класс Gen3
        if(iOb2 instanceof Gen3Ex<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen3Ex");
        //Проверить , является ли strOb2 объектом класса Gen3Ex
        if(strOb2 instanceof Gen3Ex<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen3Ex");
        //Проверить , является ли strOb2 объектом класса Gen3
        if(strOb2 instanceof Gen3<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen3");
        System.out.println();
        //Проверить , является ли iOb экземпляром класса Gen3,
        //что совсем не так
        if(iOb instanceof Gen3Ex<?>)
            System.out.println("Объект iOb является экземпляром класса Gen3Ex");
        //Проверить , является ли iOb экземпляром класса Gen3
        //что так и есть
        if (iOb instanceof Gen3<?>)
            System.out.println("Объект iOb является экземпляром класса Gen3");
        //Следующий код не скомпилируется , так как  сведения об
        //обобщенном типе отсутствуют во время выполнения
        //if(iOb2 instanceof Gen3Ex<Integer>
        //System.out.println("Объект iOb2 является экземпляром класса Gen3Ex<Integer>");
    }
}
