package SamoObuchenie;
class Potok implements Runnable{
    Thread thrd;
    Potok(String name){
        thrd=new Thread(this,name);
        System.out.println(thrd.getName()+" запущен");
        thrd.start();
    }
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("\n"+thrd.getName()+" - "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class PotokDemo {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        Potok pOb1 = new Potok("Child1");
        Potok pOb2 = new Potok("Cild2");
        Potok pOb3 = new Potok("Cild3");

//        try {
//            pOb1.thrd.join();
//            System.out.println("Поток 1 остановлен");
//            pOb2.thrd.join();
//            System.out.println("Поток 2 остановлен");
//            pOb3.thrd.join();
//            System.out.println("Поток 3 остановлен");
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
        do{
            System.out.print(".");
            try{
                Thread.sleep(100);

            }catch (InterruptedException e){
                System.out.println(e);
            }
        }while (pOb1.thrd.isAlive()||pOb2.thrd.isAlive()||pOb3.thrd.isAlive());
        System.out.println("Завершение основного потока");
    }
}
