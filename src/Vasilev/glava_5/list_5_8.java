package Vasilev.glava_5;

public class list_5_8 {
    static void show1D(int[] nums){
        for(int s:nums){
            System.out.printf("%4d",s);
        }
        System.out.println();
    }
    static void show2D(int[][] nums){
        for(int[] p:nums){
            for(int s:p){
                System.out.printf("%4d",s);
            }
            System.out.println();
        }
    }
    static int[] prod(int[][] A,int[] B){
        int[] C = new int[A.length];
        for(int i=0;i<C.length;i++){
            C[i]=0;
            for(int k=0;k<B.length;k++){
                C[i]+=A[i][k]*B[k];
            }
        }
        return C;
    }

    public static void main(String[] args) {
            int[][] A={{1,0,3,-1},{2,-1,-2,3},{-1,1,0,2}};
            int[] B={1,-1,3,2};
            int[] C=prod(A,B);
        System.out.println("Matrix A");
        show2D(A);
        System.out.println("Vector B");
        show1D(B);
        System.out.println("Vector C");
        show1D(C);
    }
}
