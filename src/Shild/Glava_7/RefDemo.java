package Shild.Glava_7;
class Box {
   private double width;
   private double height;
   private double depth;
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}
    class BoxWeight extends Box {
        double weight;
        BoxWeight(double w,double h,double d,double m){
           super(w,h,d);
            weight = m;
        }
//        double volBox(){
//            return weight*height*depth*width;
//        }

    }

public class RefDemo {
    public static void main(String[] args){
        BoxWeight  weightbox = new BoxWeight(3,5,7,8.37);
        Box painbox = new Box();
        double vol;
        vol=weightbox.volume();
        System.out.println("Объем weightbox равен "+vol);
        System.out.println("Вес weightbox равен "+weightbox.weight);
        System.out.println();
        painbox = weightbox;
        vol = painbox.volume();
        System.out.println("Объем painbox равен "+vol);



    }
}
