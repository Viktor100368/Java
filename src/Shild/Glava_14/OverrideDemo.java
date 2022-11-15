package Shild.Glava_14;
//Переопределение обобщенного метода в обобщенном классе
class Pen<T> {
    T ob;//Объявить объект типа Т

    //Передать конструктору ссылку на объект типа Т
    Pen(T o) {
        ob = o;
    }

    //Возвратить объект ob
    T getOb() {
        System.out.print("Метод getob() из класса Pen: ");
        return ob;
    }
}
    //Подкласс , производный от класса Pen и
    //переопределяющий метод getob()
    class Pen2<T> extends Pen<T>{
        Pen2(T o){
            super(o);
        }
        //Переопределить метод getob()
        T getob(){
            System.out.print("Метод getob() из классак Pen2: ");
            return ob;
        }
    }

public class OverrideDemo {
    public static void main(String[] args) {
        //Создать объект типа Pen для целых чисел
        Pen<Integer> iOb= new Pen<>(88);
        //Создать объект типа Pen2 для целых чисел
        Pen2<Integer> iOb2 = new Pen2<>(99);
        //Создать объект типа Pen2 для символьных строк
        Pen2<String> strOb2 = new Pen2<>("Текст сообщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
