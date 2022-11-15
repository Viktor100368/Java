package Prohor;

public class List_10_13 {
    public static void main(String[] args){
        for(int i= 0;i<11;i++){
            System.out.println(i+"! = "+ factorial(i));
        }
    }

    public static long factorial(long a){
        if(a<=1) return a;
        else
            return a*factorial(a-1);
    }
}
