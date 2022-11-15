package Shild.Glava_9;

public class IFTest3 {
    public static void main(String[] args){
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for(int i= 0;i<15;i++)mystack.push(i);
        mystack=fs;
        for(int i=0;i<8;i++) mystack.push(i);

        //Выгрузка стека
        mystack=ds;
        System.out.println("Динамический стек : ");
        for(int i=0;i<15;i++)
            System.out.print(" "+mystack.pop());
        System.out.println();
        mystack=fs;
        System.out.println("Фиксированный стек: ");
        for(int i=0;i<8;i++)
            System.out.print(" "+mystack.pop());
        System.out.println();

    }
}
