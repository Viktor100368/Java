package Shild.Glava_15;

public class L1 {
    interface MyNumber{
        int getValue(int n);
    }
    public static void main(String[] args) {
        MyNumber myNum;
        for(int i=0;i<10;i++) {
            myNum=(n) -> (int)(Math.random() * n);
            System.out.println(myNum.getValue(100));
        }
    }
}
