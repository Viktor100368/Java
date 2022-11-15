package Shild.Glava_14;
class Proba<T>{
    private T aa;
    private T bb;

    Proba(T a,T b){
        aa=a;
        bb=b;
    }
    public T getA(){
        return aa;
    }
    public T getB(){
        return bb;
    }
    void showTypesA(){
        System.out.println("Типом Т является: "+ aa.getClass().getName());
    }
    void showTypesB(){
        System.out.println("Типом Т является: "+ bb.getClass().getName());
    }

}
public class ProvaDemo {
    public static void main(String[] args){
        Proba<Integer> obI;
        obI=new Proba<>(4,9);
        System.out.println("a= "+obI.getA());
        System.out.println("b= "+obI.getB());
        Proba<String> obS= new Proba<>("Hello","World");
        System.out.println("a= "+obS.getA());
        System.out.println("b= "+obS.getB());
        System.out.println(obS.getA()+" "+obS.getB());
        obI.showTypesA();
        obI.showTypesB();
        obS.showTypesA();
        obS.showTypesB();
    }
}
