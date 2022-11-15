package courseOnLine.Phinashkin.structureData;

import java.util.Scanner;
import java.util.Vector;

public class VectorHomeTask {
    static boolean checkStr(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
                return false;
        }
        return true;
    }




    public static void main(String[] args) {
        String str;
        int capacity = 0;
        Scanner scanner = new Scanner(System.in);
        Vector vector = new Vector(0);
        int strSize=0;
        while (true){
            System.out.println("Введите размер вектора");
             str = scanner.nextLine();
             if(!checkStr(str))
                 System.out.println("Вы ввели не число,попробуйте еще раз");
             else break;
        }
        capacity=Integer.parseInt(str);
        vector.ensureCapacity(capacity);
        for(int i=1;i<=capacity;i++){
            vector.add(i);
        }
        for(int i=0;i<vector.size();i++)
            System.out.print(vector.get(i)+" ");
        System.out.println();
        System.out.println("size "+vector.size());
        System.out.println("capacity "+vector.capacity());
    }
}
