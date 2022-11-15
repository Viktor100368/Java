package Shild.Glava_14;

//Простой обобщенный класс.
//Здесь Т обозначает параметр типа,
//который будет заменен реальным типом
//при создании объекта типа Gen
class Gen<T> {
    T ob;//объявить объект типа Т

    //передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob =  o;
    }

    //Возвратить объект ob
    T getOb() {
        return ob;
    }

    //Показать тип Т
    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}

//Продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        //создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;
        //Создать объект типа Gen<Integer> и присвоить
        //ссылку на него переменной iOh. Обратите внимание на
        //применение автоупаковки для инкапсуляции значения 88
        //в объекте типа Integer
        iOb = new Gen<Integer>(88);
        //Показать тип данных, хранящихся в переменной iOb
        iOb.showType();
        //получить значение переменной iOb. Обратите внимание на то,
        //что для этого не требуется никагого приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: "+v);
        System.out.println();
        //Сздать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<>("Tекст обобщений");
        //Показать тип данных, хранящихся в переменной strOb
        strOb.showType();
        //Получить значение переменной strOb. И в этом случае
        //приведение типов не требуется
        String str =strOb.getOb();
        System.out.println("значение: "+str);
    }
}