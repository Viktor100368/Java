package Prohor;

public class List_11_16 {
    public static void main (String[] args){
        A_1 obj= new A_1();
        obj.func(10);
    }
}
class A_1{
    private int z = 30;
    public void func(final int x){
        int y = 20;
        class B_1{
            private int k = 40;
            public void func(){
                System.out.println("B_1.func()");
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println(A_1.this.z);
                System.out.println(k);
                System.out.println(this.k);
            }
        }
        System.out.println("A_1.func()");
        B_1 obj = new B_1();
        obj.func();

    }
}
