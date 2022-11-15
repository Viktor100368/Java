package courseOnLine.box;

public class BoxWeight extends Box {
    private double weight;
    public BoxWeight(){
        super();
        weight = 0;
    }
    public BoxWeight(double width,double height,double deep,double weight){
        super(width,height,deep);
        this.weight=weight;
    }
    public BoxWeight(double size,double weight){
        super(size);
        this.weight = weight;
    }

    @Override
    void showInfo(String str) {
        super.showInfo(str);
        System.out.println("Вес коробки : "+weight);
    }


}
