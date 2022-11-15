package Prohor;

import java.util.Arrays;

public class List_10_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(arr));
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void func(int[] a){
        a[0]=9;
    }
}
