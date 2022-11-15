package courseOnLine.myLambda;

public class Radio implements ElectrisitiConsumer {
    @Override
    public void electrisityOn() {
        radioOn();
    }
    public void radioOn(){
        System.out.println("Радио говорит");
    }
}
