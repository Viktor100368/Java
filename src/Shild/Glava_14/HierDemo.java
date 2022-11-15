package Shild.Glava_14;
//В подклассе могут быть введены саои параметры типа
class Gen1<T>{
    T ob;//Объявить объект типа Т
    //Передать конструктору ссылку на объект типа Т
    Gen1(T o){
        ob = o;
    }
    //Возвратить ссылку ob
    T getOb(){
        return ob;
    }
}
//Подкласс, произвадный от класса Gen, где
// определяется второй параметр типа V
class Gen2<T,V> extends Gen1<T>{
    V ob2;
    Gen2(T o,V o2){
        super(o);
        ob2=o2;
    }
    V getOb2(){
        return ob2;
    }
}
//Создать объект типа Gen2
public class HierDemo {
    public static void main(String[] args){
        //Создать объекты типа Gen2 для символьных строк целых чисел
        Gen2<String, Integer> x= new Gen2<>("Значение равно: ",99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
