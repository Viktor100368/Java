package Shild.Glava_6;
//В этом классе определяется целочисленный стек, в котором
//можно хранить до 10 целочисленных значений
class Stack{
    int stck[] = new int[10];
    int tos;
    //Инициализировать вершинц стека
    Stack(){
        tos=-1;
    }
    //разместить элемент в стеке
    void push(int item){
        if(tos==9)
            System.out.println("стек полон");
        else
            stck[++tos]=item;
    }
    int pop(){
        if(tos<0) {
            System.out.println("стек пуст");
            return 0;
        }
        else
            return stck[tos--];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        //Разместить числа в стеке
        for (int i =0;i<10;i++)myStack1.push(i);
        for(int i=10;i<20;i++) myStack2.push(i);
        //Извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1");
        for(int i= 0;i<10;i++)
            System.out.print(myStack1.pop()+" ");
        System.out.println("\nСодержимое стека myStack2");
        for(int i= 0;i<10;i++)
            System.out.print(myStack2.pop()+" ");

    }
}
