package Shild.Glava_17;
//Продемонстрировать применение метода clone()
class TestClone2 implements Cloneable{
    int a;
    double b;
    //В это методе выызывается метод clone() мз класса Object
    public Object cloneTest(){
        try{
            //Вызвать метод clone() из класса Jbject
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Клонирование не возможно");
            return this;
        }
    }
}
public class CloneDemo2 {
    public static void main(String[] args){
        TestClone2 x1 = new TestClone2();
        TestClone2 x2 ;
        x1.a=10;
        x1.b =20.98;
        x2 = (TestClone2)x1.cloneTest();//клонировать объект x1
        System.out.println("x1: "+x1.a +" "+x1.b);
        System.out.println("x2: "+x2.a+" "+x2.b);

    }
}
