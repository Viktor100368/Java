package Prohor;

public class List_10_11 {
    public static void main(String[] args){
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
    }

    public static int sum(int...a){
        int s=0;
        System.out.println("Значений "+ a.length);
        for(int i=0; i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
}
