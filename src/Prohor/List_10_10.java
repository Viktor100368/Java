package Prohor;

import java.util.Arrays;

public class List_10_10 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int [] arr2;
        arr2= changeArr(arr1,2);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] changeArr(int[] a,int x){
        int[] arr= new int[a.length];
        for(int i=0;i<a.length;i++){
            arr[i]=a[i]*x;
        }
        return arr;
    }
}
