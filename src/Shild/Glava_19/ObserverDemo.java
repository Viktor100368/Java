package Shild.Glava_19;
/*
Продемонстрировать приемник класс Obdervable
и интерфейса Observer
 */
import java.util.*;
//это наблюдающий класс
class Watcher implements Observer{
    public void update(Observable obj,Object arg){
        System.out.println("Метод update() вызван , отсчет count равен "+
                ((Integer)arg).intValue());
    }
}
//А это наблюдаемый класс
class BeginWatched extends Observable{
    void cunter(int period){
        for(; period>=0; period--){
            setChanged();
            notifyObservers(new Integer(period));
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Ожидание прервано");
            }
        }
    }
}
public class ObserverDemo {
    public static void main(String[] args){
        BeginWatched observed = new BeginWatched();
        Watcher observing = new Watcher();
        /*
        Ввести наблюдающий объект в список наблюдателей
        за наблюдаемымым объектом
         */
        observed.addObserver(observing);
        observed.cunter(10);
    }
}
