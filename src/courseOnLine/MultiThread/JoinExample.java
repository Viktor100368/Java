package courseOnLine.MultiThread;

public class JoinExample {
    public static void main(String[] args) {

   Thread t1= new Thread(new MyClass(),"t1");
   Thread t2 = new Thread(new MyClass(),"t2");
   t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
