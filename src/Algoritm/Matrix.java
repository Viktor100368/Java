package Algoritm;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args){
        int[][] a= new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j]=i+j+1;
        System.out.println(Arrays.deepToString(a));
        int[][] b= new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                b[i][j]=i+j+3;
        System.out.println(Arrays.deepToString(b));
        int[][]c = new int[3][3];
        System.out.println(Arrays.deepToString(c));
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++)
                    c[i][j]= a[i][k]*b[k][j];
            }
        System.out.println(Arrays.deepToString(c));
    }
}
