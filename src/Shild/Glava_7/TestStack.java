package Shild.Glava_7;
//П этом классе определяется целочиисленный стек, который может
//содержать 10 значений
class Stack{
    /*
    Теперь переменные stck и tos являются закрытыми.
    Это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек.
     */
    private int stck[];
    private int tos;
    //инициализировать верпщину стека
    Stack(int size){
        stck= new int[size];
        tos = -1;
    }
    //разместить элемени в стеке
    void push (int item){
        if(tos==stck.length-1)
            System.out.println("Стек заполенн");
        else
            stck[++tos]=item;
    }
    //Извлечь элемент из стека
    int pop(){
        if(tos<0) {
            System.out.println("стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}
public class TestStack {
    public static void main(String[] args){
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);
        for(int i= 0;i<5;i++)
            myStack1.push(i);
        for(int i=0;i<8;i++)
            myStack2.push(i);

        for(int i=0;i<5;i++)
            System.out.print(" "+myStack1.pop());
        System.out.println();
        for(int i=0;i<8;i++)
            System.out.print(" "+myStack2.pop());

     }
}
