package Prohor.Glava_12;

import java.util.function.BiFunction;

public class Ljambda {
    public static void main(String[] args) {
        int x=0;
        x=Ljambda.test((a,b)->a+b,10,20);
        System.out.println(x);
    }
    public static int test(
            BiFunction<Integer,Integer,Integer>f,int x,int y){
        return f.apply(x,y);
    }
}
