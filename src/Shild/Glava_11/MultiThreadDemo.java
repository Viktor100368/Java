package Shild.Glava_11;
//Создать несколько потоков исполнения
class MyNewThread implements Runnable{
    String name;//имя потока исполнения
    Thread t;
    MyNewThread(String threadName){
        name= threadName;
        t= new Thread(this,name);
        System.out.println("Новый поток: "+t);
        t.start();//запустить поток на исполнкние
    }
    //Точка входа в поток исполнения
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name +": "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name +" прерван.");
        }
        System.out.println(name+ " завершен.");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
//        new MyNewThread("Один");
//        new MyNewThread("Два");
//        new MyNewThread("Три");
        String[] array={"Один","Два","Три"};
        for(int i=0;i<array.length;i++)
                new MyNewThread(array[i]);
        try{
            //ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
