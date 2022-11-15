package courseOnLine.myLambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
//        public ElectrisitiConsumer consumer;
//        public ElectrisitiConsumer consumer2;
    private List<ElectrisitiConsumer> listeners = new ArrayList<>();
    public void addElectrisitiListener(ElectrisitiConsumer listener){
        listeners.add(listener);
    }
    public void removeElectrisitiListener(ElectrisitiConsumer listener){
        listeners.remove(listener);
    }
        public void switcherOn(){
            System.out.println("выключатель включен");
//            if(consumer != null)
//                consumer.electrisityOn();
//            if(consumer2 != null)
//                consumer2.electrisityOn();
            for(ElectrisitiConsumer liste:listeners){
                liste.electrisityOn();
            }
        }
    }

