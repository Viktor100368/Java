package Prohor;

public class List_11_18 {
    public static void main(String[] args) {
        Alf objA = new Alf();
        Bet objB = new Bet();
        Cem objC = new Cem();
        objA.func();
        objB.func();
        objC.func();
        Alf obj1 = new Alf();
        Alf obj2 = new Bet();
        Alf obj3 = new Cem();
        obj1.func();
        obj2.func();
        obj3.func();
        if(obj3 instanceof Cem) {
            ((Cem) obj3).func2();
        }
    }
}
class Alf{
    public void func(){
        System.out.println("Alf.func()");
    }
}
class Bet extends Alf{
    @Override
    public void func() {
        System.out.println("Bet.func()");
    }
}
class Cem extends Alf{
    @Override
    public void func(){
        System.out.println("Cem.func()");
    }
    public void func2(){
        System.out.println("Cem.func2()");
    }

}
