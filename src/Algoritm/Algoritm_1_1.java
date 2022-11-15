package Algoritm;

import java.util.Arrays;

public class Algoritm_1_1 {
    private int[] spans;
    private int[] quotes;
    private int k;
    boolean span_end;
    Algoritm_1_1(int[] arr){
        quotes=arr;
        spans= new int[arr.length];
    }

    public int[] spDecide(){
        for(int i = 0;i<quotes.length;i++){
           k=1;
            span_end=false;
            while ((i-k>=0)&& !span_end){
                if(quotes[i-k]<=quotes[i]){
                    k=k+1;
                }
                else {
                    span_end =true;
                }

            }
            spans[i]=k;
        }
        return spans;
    }

    public static void main(String[] args) {
        int[] arr= {7,11,8,6,3,8,9};
        Algoritm_1_1 al=new Algoritm_1_1(arr);
        System.out.println(Arrays.toString(al.spDecide()));
    }


}
