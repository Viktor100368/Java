package Shild.Glava_15;
//Использовать ссылку на метод, чтобы найти
//максимальное значение в коллекции
import java.util.*;
class MyClass{
    private int val;
    MyClass (int v){val=v;}
    int getVal(){
        return val;
    }
}
public class UseMethodRef {
    //Метод compare(), совместимый с аналогичным методом,
    //определенным в интерфейсе Comparator<T>
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));
        //найти максимальнае значение, используя метод compareMC()
        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}