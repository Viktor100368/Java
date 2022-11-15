package courseOnLine.box;

public class Box {
    private double width;
    private double height;
    private double depth;
   public Box(){
        width=height=depth=0.0;
    }
    public Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth = depth;
    }
    public Box(double size){
        width=size;
        height= size;
        depth = size;
    }
    public Box(Box box1,Box box2){
        width=box1.width+box2.width;
        height=box1.height+box2.height;
        depth=box1.depth+box2.depth;
    }
    public Box increase(Box box){
        Box incBox =new Box();
        incBox.width=this.width+box.width;
        incBox.height=this.height+box.height;
        incBox.depth = this.depth+box.depth;
        return incBox;
    }
    void showInfo(String str){
        System.out.println(str+"  width "+width+" height "+height+" depth "+depth);
    }
}
