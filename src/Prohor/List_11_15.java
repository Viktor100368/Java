package Prohor;

public class List_11_15 {
    public static void main(String[] args){
       // Alfa.Beta obj = new Alfa.Beta();
        //obj.func();
        Alfa obj2 = new Alfa();
        obj2.func();

    }
}

class Alfa{
    private static int x = 10;
    private Beta obj = new Beta();
    public void func(){
        System.out.println("Alfa.func()");
        obj.func();
    }

    private static class Beta{
        public void func(){
            System.out.println("Alfa.Beta.func()");
            System.out.println(x);
        }
    }
}
