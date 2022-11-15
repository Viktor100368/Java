package Prohor;

public class List_11_10 {
    public static void main(String[] args){
        Cc obj = new Cc(10, 20, 30);
        System.out.println("A.x= "+ obj.x+
                "B.y= "+ obj.y+
                "C.z= "+ obj.z);
    }
}

class Aa{
    public int x;

    public Aa(int x){
        this.x=x;
        System.out.println("A.A()");
    }
}
class Bb extends Aa{
    public int y;

    public Bb(int x,int y){
        super(x);
        this.y = y;
        System.out.println("B.B()");
    }
}

class Cc extends Bb{
    public int z;

    public Cc(int x,int y,int z) {
        super(x, y);
       this.z = z;
       System.out.println("C.C()");
    }
}