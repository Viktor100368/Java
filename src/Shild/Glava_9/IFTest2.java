package Shild.Glava_9;

public class IFTest2 {
    public static void main(String[] args){
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        //Загрузить числа в стек
        for(int i= 0;i<5;i++)mystack1.push(i);
        for(int i= 0;i<8;i++) mystack2.push(i);
        //Выгрузить из стека
        System.out.println("Стек в mystack1: ");
        for(int i=0;i<5;i++)
            System.out.print(" "+mystack1.pop());
        System.out.println();
        System.out.println("Стек в mystack2: ");
        for(int i=0;i<8;i++)
            System.out.print(" "+mystack2.pop());
        System.out.println();
        //загружаем динамический стек
        for(int i= 0;i<10;i++)mystack1.push(i);
        for(int i=0;i<20;i++) mystack2.push(i);
        //Выгружаем динамический стек
        System.out.println("Динамический стек в mystack1: ");
        for(int i=0;i<10;i++)
            System.out.print(" "+mystack1.pop());
        System.out.println();
        System.out.println("Динамический стек в mystack2: ");
        for(int i=0;i<20;i++)
            System.out.print(" "+mystack2.pop());
    }
}
