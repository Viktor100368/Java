package courseOnLine.OOP;

class Rect{
    double lenght;
    double width;
    void setRect(double lenght,double width){
        this.lenght=lenght;
        this.width = width;
    }
    double perimetr(){
        return 2*(lenght+width);
    }
    double area(){
        return lenght*width;
    }
}
public class RectDemo {
    public static void main(String[]args) {
        Rect rect = new Rect();
        rect.width=5;
        rect.lenght=8;
        System.out.println("периметр= "+rect.perimetr());
        System.out.println("площадь= "+rect.area());
    }
}
