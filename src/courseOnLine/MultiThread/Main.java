package courseOnLine.MultiThread;

public class Main {
    public static void main(String[] args)throws InterruptedException{
        Thread taskThread = new Thread(taskThatFinishesEarlyOnInterruption());
        taskThread.start();
        Thread.sleep(3000);
        taskThread.interrupt();
        taskThread.join();
    }
    private static Runnable taskThatFinishesEarlyOnInterruption(){
        return ()->{
            for(int i=0;i<10;i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Interrupt "+e);
                }
            }
        };
    }
}
