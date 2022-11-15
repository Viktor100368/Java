package courseOnLine.MultiThread;

public class MyClass implements Runnable {
    @Override
    public void run() {
        Thread t= Thread.currentThread();
        System.out.println("Thread started "+t.getName());
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread entered: "+t.getName());
    }
}
