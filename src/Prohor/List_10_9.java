package Prohor;

public class List_10_9 {
    public static void main(String[] args){
        String rezult = "";
        rezult = print(new int[]{1,2,3,4,5},"; ");
        System.out.println(rezult);

    }

    public static String print(int[] a, String s){
        StringBuilder sb = new StringBuilder();
        for(int i= 0;i<a.length;i++){
            sb.append(String.valueOf(a[i]));
            if(i!=a.length - 1) sb.append(s);
        }
        return sb.toString();
    }
}
