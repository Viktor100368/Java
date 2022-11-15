package courseOnLine.myLambda;

public class Main {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        sw.addElectrisitiListener(lamp);
       sw.addElectrisitiListener(radio);
       sw.addElectrisitiListener(new ElectrisitiConsumer() {
           @Override
           public void electrisityOn() {
               System.out.println("Пожар");
           }
       });
       sw.addElectrisitiListener( ()-> System.out.println("Fire") );
        sw.switcherOn();

    }

}
