package Prohor.Glava_12;

public class ClassD {
    private IRead ir;
    private IWrite iw;
    private String str="";

    public ClassD(IRead r,IWrite w){
        this.ir = r;
        this.iw = w;
        this.str = ir.read();
    }
    public void change(){
        this.str = this.str.toUpperCase();
    }
    public void print(){
        System.out.println(this.str);
    }



}
