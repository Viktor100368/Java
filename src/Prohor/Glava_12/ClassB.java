package Prohor.Glava_12;

public class ClassB implements IRead{
    private String s ="строка 2";
    @Override
    public String read(){
        return this.s;
    }
    public void print(){
        System.out.println(this.s);
    }
}
