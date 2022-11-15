package Shild.Glava_19;
//Продемонстрировать применение классоа Timer and TimerTask
import java.util.*;
class MyTimerTask extends TimerTask{
    public void run(){
        System.out.println("Задание по таймеру выполняется.");
    }
}
public class TTest {
    public static void main(String[] args){
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /*
        Установить первоначальную паузу в теченеие одной
        секунды, а затем повторять задание каждые полсекунды
         */
        myTimer.schedule(myTask,1000,500);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        myTimer.cancel();
    }
}
