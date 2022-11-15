package Vasilev.glava_3;
class myClass_3_5{
    static int count=0;
    myClass_3_5(){
        count++;
        System.out.println("Создан объект номер "+count);
    }
    static void show(){
        System.out.println("Количество объектов "+count);
    }

}
public class list_3_5 {
    public static void main(String[] args) {
        myClass_3_5.show();
        myClass_3_5 objA = new myClass_3_5();
        myClass_3_5 objB = new myClass_3_5();
        myClass_3_5 objC = new myClass_3_5();
        myClass_3_5.show();
        objB.show();
        objC.show();
    }
}
