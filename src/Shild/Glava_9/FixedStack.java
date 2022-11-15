package Shild.Glava_9;

public class FixedStack implements IntStack {
    private int stck[];
    private int  tos;
    //Выделить память и инициализировать стек
    FixedStack(int size){
        stck= new int[size];
        tos=-1;
    }
    //разместить элемент в стеке
    public void push(int item){
        if(tos==stck.length-1)
            System.out.println("Стек заполнен");
        else
            stck[++tos]= item;
    }
    //Извечь элемент из стека
    public int pop(){
        if(tos <0) {
            System.out.println("Стек не заполнен");
            return 0;
        }
        else
            return stck[tos--];
    }

}
