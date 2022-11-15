package Prohor;

public class List_11_17 {
    public static void main(String[] args){
        final int x= 10;
        An obj = new An(){
            private int y = 20;

            @Override
            public void func(){
                System.out.println("?.func()");
                System.out.println(x);
                System.out.println(y);
                System.out.println(this.y);
                System.out.println(z);
                System.out.println(super.z);

            }
        };
        obj.func();
    }
}

class An{
    public int z=30;
    public void func(){
        System.out.println("An.func()");
    }
}
