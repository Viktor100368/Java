package Shild.Glava_17;
//Продемонстрировать применение метода clone()
class TestClone implements Cloneable{
    int a;
    double b;
    //В это методе выызывается метод clone() мз класса Object
    TestClone cloneTest(){
        try{
            //Вызвать метод clone() из класса Jbject
            return (TestClone)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Клонирование не возможно");
            return this;
        }
    }
}
public class CloneDemo {
    public static void main(String[] args){
        TestClone x1 = new TestClone();
        TestClone x2 ;
        x1.a=10;
        x1.b =20.98;
        x2 = x1.cloneTest();//клонировать объект x1
        System.out.println("x1: "+x1.a +" "+x1.b);
        System.out.println("x2: "+x2.a+" "+x2.b);

    }
}
