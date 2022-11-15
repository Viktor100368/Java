package Prohor.Glava_12;

public class ClassE implements IRead,IWrite {
    @Override
    public String read(){
        return "строка 3";
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }
}
