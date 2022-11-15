package Prohor;

public class List_11_13 {
    public static void main(String[] args){
        Aaa aaa = new Aaa(10);

        aaa.func();
    }
}
class Aaa{
    private Bbb b;
    private int x;

    public Aaa(int x){
        this.b = this.new Bbb();
        this.x = x;
    }
    public void func(){
        System.out.println("Aaa.func()");
        b.func();
    }
    private class Bbb {
        public void func() {
            System.out.println("Aaa.Bbb.func()");
            System.out.println(Aaa.this.x);

            System.out.println(x);
        }
    }
}
