package Shild.Glava_11;
//Применить метод join(), чтобы ожидать завершения потоков исполнения
class NewThreadJoin implements Runnable{
    String name;//Имя потока исполнения
    Thread t;
    NewThreadJoin(String threadName){
        name= threadName;
        t= new Thread(this,name);
        System.out.println("Новый поток: "+t);
        t.start();//запустить поток исполнения
    }
    //Точка входа в поток исполнения
    public void run(){
        try{
            for(int i= 5;i>0;i--){
                System.out.println(name+ ": "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
public class DemoJoin {
    public static void main(String[] args){
        MyNewThread ob1 = new MyNewThread("Один");
        MyNewThread ob2 = new MyNewThread("Два");
        MyNewThread ob3 = new MyNewThread("Три");
        System.out.println("Поток Один запущен: "+ob1.t.isAlive());
        System.out.println("Поток Два запущен: "+ob2.t.isAlive());
        System.out.println("Поток Три запущен: "+ob3.t.isAlive());
        //Ожидать завершения потоков исполнения
//        try{
//            System.out.println("Ожидание завершения потоков");
//            ob1.t.join();
//            ob2.t.join();
//            ob3.t.join();
//        }catch (InterruptedException e){
//            System.out.println("Главный поток прерван.");
//        }
        try{
        for(int i=0;i<4;i++) {
            System.out.println("Главный: " + i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException e){}

//        while (ob1.t.isAlive()|ob2.t.isAlive()|ob3.t.isAlive()){
//            ;
//        }
        while(ob1.t.isAlive()){}
        while (ob2.t.isAlive()){}
        while (ob3.t.isAlive()){}
        System.out.println("Поток Один запущен: "+ob1.t.isAlive());
        System.out.println("Поток Два запущен: "+ob2.t.isAlive());
        System.out.println("Поток Три запущен: "+ob3.t.isAlive());
        System.out.println("Главный закончил");
    }
}
