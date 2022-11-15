package Shild.Glava_11;
//Неправильная реализация поставщика и потребителя
class Q{
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while(valueSet==false)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Исключение типа InterruptedException перехвачено");
            }
        System.out.println("Получено: "+n);
//            try {
//                if (n > 1024) wait();
//            }catch (InterruptedException e){}
            valueSet = false;
            notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Исключение типа InterruptedException перехвачено");
            }
        this.n=n;
//     try{
//         if(n>1024)wait();
//     }catch (InterruptedException e){}

        valueSet = true;
        System.out.println("Отправленно: "+n);
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q = q;
        new Thread(this,"Поставщик").start();
    }
    public void run(){
        int i=0;
        while(true)
            q.put(i++);
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q = q;
        new Thread(this,"Потребитель").start();
    }
    public void run(){
        while(true)
            q.get();
    }
}

public class PC {
    public static void main(String[] args){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
