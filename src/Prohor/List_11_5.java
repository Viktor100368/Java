package Prohor;

public class List_11_5 {
    public static void main(String[] args){
        Class1_1 c =new Class1_1();
        System.out.println(c.getX());
        c = new Class1_1(33);
        System.out.println(c.getX());
    }
}

    class Class1_1{
    private int x;

    public Class1_1() {

        this(25);
    }

    public Class1_1(int x){
        this.x=x;

    }

    public int getX(){
        return x;
    }

    }
