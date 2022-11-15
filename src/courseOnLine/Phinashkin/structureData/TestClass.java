package courseOnLine.Phinashkin.structureData;


import java.util.Scanner;

public class TestClass {
    static int rows=0;
    static int colums=0;
    static String[][] array;
    public static void main(String[] args) {

        int newRows=0;
        int newColums=0;
        int temp=0;
        Scanner in = new Scanner(System.in);
        int iStr;
        String str;
        System.out.println("Введите количество рядов в матрице: ");
        iStr =Integer.parseInt(in.nextLine());
        if(iStr>=0 && iStr<=9)
            rows=iStr;
        System.out.println("Введите количество колонок в матрице: ");
        iStr=Integer.parseInt(in.nextLine());
        if(iStr>=0 && iStr<=9)
            colums=iStr;
         array = new String[rows][colums];
            printMatrix(array);
        while (true) {
            System.out.println("Введите индекс ряда");
            temp = Integer.parseInt(in.nextLine());
            newRows = temp;
            System.out.println("Введите индекс колонки");
            temp = Integer.parseInt(in.nextLine());
            newColums = temp;
            if(newRows<rows && newColums <colums)
                break;
            else
                System.out.println("Введенные индексы не верны, попробуйте еще раз");
        }
        System.out.println("Введите слово");
         str=in.nextLine();
         array[newRows][newColums]=str;
         printMatrix(array);

    }
    private static void printMatrix(String[][] arr){
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

}
