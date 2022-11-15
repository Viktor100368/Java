package Prohor;

import java.util.Date;

public class List_10_12 {
    public static void main(String[] args){
        func(1,2.5, "Строка");
        System.out.println();
        func(1,2.5,300L,"Строка",new Date());
    }

    public static void func(Object...a){
        for(Object o:a){
            System.out.println(o);
        }
    }
}
