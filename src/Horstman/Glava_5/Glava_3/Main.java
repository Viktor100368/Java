package Horstman.Glava_5.Glava_3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
      int[] array=new int[100];
      for(int i=0;i<array.length;i++){
          array[i]=(int)(Math.random()*100);
      }
      for(int i:array){
          System.out.print(" "+i);
      }
        System.out.println();
        Arrays.sort(array);
      for(int i:array)
          System.out.print(" "+i);
      int [] array2=new int[array.length];
      for(int i=0,j=array.length-1;i<array.length;i++,j--){
          array2[i]=array[j];
      }
        System.out.println();
      for(int i:array2)
          System.out.print(" "+i);
    }
}
