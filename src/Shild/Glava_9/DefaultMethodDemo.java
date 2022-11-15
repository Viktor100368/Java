package Shild.Glava_9;

import Prohor.Glava_12.M;

//Реализовать интерфейс MyIF
class MyIFImp implements MyIF{
    //В этом классе должен быть реализован толька метод getNumber(),
    //опреоделенный в интерфейсе MyIF
    //А вызов метода getString() разрешается по умолчанию
    public int getNumber(){
        return 100;
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args){
        MyIFImp obj = new MyIFImp();
        //Метод getNumber() можно вызвать, т.к. он явно реализован
        //в классе MyIFImp:
        System.out.println(obj.getNumber());
        //Метод getNumber() также можно вызвать, т.к. в интерфейсе
        //имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}
