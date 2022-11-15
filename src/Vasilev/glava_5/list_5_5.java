package Vasilev.glava_5;

public class list_5_5 {
    public static void main(String[] args) {
        int rows=9,cols=9;
        int[][] table= new int[rows][cols];
        String txt = "\t|\t";
        for(int i=0;i<cols;i++) {
            txt += i + "\t";
        }
        txt += "\n";
        for(int i=0;i<10+8*cols;i++){
            txt+="-";
        }
        for(int i=0;i<table.length;i++){
            txt+= "\n"+(i+1)+"\t|\t";
            for(int j=0;j<table[i].length;j++){
                table[i][j]=(i+1)*(j+1);
                txt+=table[i][j]+"\t";
            }
        }
        System.out.println("Таблица умножения");
        System.out.println(txt);
    }
}