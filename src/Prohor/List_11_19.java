package Prohor;

public class List_11_19 {
    public static void main(String[] args) {
        A_2 obj = new A_2();
        A_2.func(obj);
        List_11_19.func(obj);
        System.out.println(obj.s);
    }

    public static void func(A_2 obj) {

        //System.out.println(obj.x);
        System.out.println(obj.getX());
        System.out.println(obj.s);
        obj.s = "Новая строка";
    }
}

class A_2{
    private int x = 10;
    public String s = "Строка";

    public static void func (A_2 obj){
        System.out.println(obj.x);
        System.out.println(obj.s);
        obj.x=50;
    }
    public int getX(){
        return this.x;
    }
}
