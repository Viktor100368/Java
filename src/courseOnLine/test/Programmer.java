package courseOnLine.test;

public class Programmer extends Employee implements ProgrammingAble{

    public Programmer(String s){
        super(s);
    }

    @Override
    public void programming() {
        System.out.println("Я программирую");
    }
}
