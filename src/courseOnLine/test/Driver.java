package courseOnLine.test;

public class Driver extends Employee implements DriveAble {

    public Driver(String s){
        super(s);
    }

    @Override
    public void drive() {
        System.out.println("Я вожу");
    }
}
