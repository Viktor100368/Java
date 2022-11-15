package Shild.Glava_14;
//Необобщенный класс может быть суперклассом для
//обобщенного класса
// Необобщенный класс
class NonGen{
    int num;
    NonGen(int i){
        num = i;
    }
    int getNum(){
        return num;
    }
}
//Обобщенный подкласс
class ObGen<T> extends NonGen{
    T ob;// объявить объект типа Т
    //Передать конструктору объект типа Т
    ObGen(T o,int i){
        super(i);
        ob= o;
    }
    //Возвратить объект ob
    T getOb(){
        return ob;
    }
}
//создать объект типа ObGen
public class HierDemo2 {
    public static void main(String[] args){
        //Создать объект типа ObGen для символных строк
        ObGen<String> w = new ObGen<>("Добро пожаловать" ,47);
        System.out.print(w.getOb()+" ");
        System.out.println(w.getNum());
    }
}
