package courseOnLine.myLambda;

public class Lamp implements ElectrisitiConsumer {
    @Override
    public void electrisityOn() {
        lightOn();
    }
    public void lightOn(){
        System.out.println("Лампа зажглась");
    }
}

