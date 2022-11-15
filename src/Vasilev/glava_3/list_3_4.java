package Vasilev.glava_3;
class myClass{
    int number;
    char symbol;
    myClass(){
        number=100;
        symbol='A';
    }
    myClass(int a,char b){
        number=a;
        symbol=b;
    }
    void show(){
        System.out.println("Значение полей: number = "+number+" symbol = "+symbol);
    }
}
public class list_3_4 {
    public static void main(String[] args) {
        myClass objA = new myClass();
        myClass objB = new myClass(200,'B');
        System.out.println("Object objA:");
        objA.show();
        System.out.println("Object objB: ");
        objB.show();
    }
}
