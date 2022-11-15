package Prohor;

public class PointDemo {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        rect.topLeft.setX(0);
        rect.topLeft.setY(0);
        rect.bottomRight.setX(100);
        rect.bottomRight.setY(100);
        System.out.println(rect.topLeft.getX()+" "+
                rect.topLeft.getY()+" "+
                rect.bottomRight.getX()+ " "+
                rect.bottomRight.getY());
    }
}
