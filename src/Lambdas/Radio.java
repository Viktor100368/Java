package Lambdas;

public class Radio implements ElectricityConsumer {
    public void radioOn(){
        System.out.println("Радио играет");
    }
    @Override
    public void electricityOn() {
        radioOn();
    }
}
