package courseOnLine.OOP;
 class Box {
    private double width;
    private double height;
    private double depth;

    Box() {
        width = height = depth = 0.0;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double size) {
        width = size;
        height = size;
        depth = size;
    }
    Box(Box box){
        this.width= box.width;
        this.height= box.height;
        this.depth = box.depth;
    }
    Box(Box box1,Box box2){
        this.width=box1.width+box2.width;
        this.depth= box1.depth+box2.depth;
        this.height = box1.height + box2.height;
    }
    double volume(){
        return width*height*depth;
    }
    Box increase(){
         return new Box(width*2,height*2,depth*2);

    }
    Box secondIncrease(Box box){
        return new Box(this.width+box.width,this.height+box.height,this.depth+box.depth);
    }
    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if(thisVolume>boxVolume)
            result =1;
        else if(thisVolume<boxVolume)
            result =-1;
        else result = 0;
        return result;
    }
}
public class BoxDemo {
     public static void main(String[] args){
         Box box = new Box(5,6,7);
         Box box1 =new Box(box);
         Box box2 = box1.increase();
         int result= box.compare(box1);
         switch (result){
             case 1:
                 System.out.println("Наша коробка больше");
                 break;
             case -1:
                 System.out.println("Наша коробка меньше");
                 break;
             case 0:
                 System.out.println("Коробки равны");
                 break;
         }
         System.out.println("box-volume = "+box.volume());
         System.out.println("box2-volume= "+box2.volume());
         Box box3= new Box(2,2,2);
         Box box4 = new Box(3,3,3);
         Box box5= box3.secondIncrease(box4);
         System.out.println(box3.volume());
         System.out.println(box4.volume());
         System.out.println(box5.volume());
         System.out.println("lllllllllllllllllllllllll");
         Box box6 = new Box(box3,box4);
         System.out.println(box6.volume());
     }
}
