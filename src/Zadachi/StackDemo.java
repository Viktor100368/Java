package Zadachi;

import java.util.Scanner;

class Stack{
    private int tos;
    private char[] stc;

    Stack(int size){
        tos = -1;
        stc = new char[size];
    }
    public void push(char ch ){
        if(tos == stc.length-1)
            System.out.println("stack is full");
        else
             stc[++tos]=ch;
    }
    public char pop(){
        if(tos<0)
            System.out.println(" stack is пуст");

            return stc[tos--];
    }
}

public class StackDemo {
    public static void main(String[] args){
     Stack stc= new Stack(10);
     char[] array={'a','r','e','w','q','o','i','n','m','z'};
     for(int i=0;i<array.length;i++){
         stc.push(array[i]);
         System.out.print(array[i]+" ");
     }
        System.out.println();
     for(int i= 0;i<array.length;i++){
         System.out.print(stc.pop()+" ");
     }

    }
}
