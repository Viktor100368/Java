package Shild.Glava_11;
//Приостановка и возобновление исполнения потока современным способом
class NewThread1 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    NewThread1(String name){
        this.name = name;
        t=new Thread(this,name);
        t.start();
    }
    //Тоска входа в поток
    public void run(){
        try{
            for(int i=15;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(200);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" завершен.");
    }
    synchronized void mysuspend(){
        suspendFlag=true;
    }
    synchronized  void myresume(){
        suspendFlag = false;
        notify();
    }
}
public class SuspendResume {
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("Один");
        NewThread1 ob2 = new NewThread1("Два");
        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один");
            System.out.println(ob1.t.getName()+" "+ob1.t.getState());
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока Один");
            ob2.mysuspend();
            System.out.println("Приостановка потока Два");

            Thread.sleep(1000);
            System.out.println(ob1.t.getName()+" "+ob1.t.getState());
            ob2.myresume();
            System.out.println("Возобновление потока Два");
        }catch (InterruptedException e){
            System.out.println(e);
        }
        //ожидать завершения потоков исполнения
        try{
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Главный поток завершен");

    }
}
