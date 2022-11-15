package Shild.Glava_16;

public class Proba {
    public static void main(String[] args) {
        int array[]={2,8,4,0,1,5};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j]= a;
                }
            }
        }
        for(int i:array)
            System.out.print(i+" ");

    }
}
