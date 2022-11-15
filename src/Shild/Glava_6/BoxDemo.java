package Shild.Glava_6;
/*
В данном примере программы для иницшализации размеров
параллелепипеда в классе BoxDemo применяется параметризированный
конструктор
 */
class Box{
    double width;
    double height;
    double depth;
    //Это конструктор класса BoxDemo
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    Box(Box o){
        width = o.width;
        height = o.height;
        depth = o.depth;
    }

    //Расчитать и возаратить объем
    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo {
    public static void main(String[] args){
        Box myBox1 = new Box(10,15,20);
        Box myBox2 = new Box();
        Box myBox3= new Box(12.8);
        Box myBox4= new Box(myBox1);
        System.out.println(" Объем myBox1: "+ myBox1.volume());
        System.out.println("Объем myBox2: "+ myBox2.volume());
        System.out.println("Объем myBox3: "+myBox3.volume());
        System.out.println("Объем myBox4: "+ myBox4.volume());
    }
}
