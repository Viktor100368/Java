package courseOnLine.exception;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int array[] =new int[5];
        for(int i= 0;i<array.length;i++)
            array[i]=i+1;
        try {
            array[8] = 29;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(array));
    }
}
