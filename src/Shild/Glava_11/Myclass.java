package Shild.Glava_11;

public  class Myclass {
    public static void main(String[] args) {
       MyTest obj = new MyTest();
        (new Thread(new MyProhThread(obj))).start();

        (new Thread(new MyProhThread(obj))).start();
        (new Thread(new MyProhThread(obj))).start();
    }
}

class MyProhThread implements Runnable{
  private MyTest obj;
  public MyProhThread(MyTest obj){
      this.obj = obj;
  }

    @Override
   public void run() {
       obj.print();
    }
}
class MyTest{
   public synchronized void print(){
        System.out.println("1. "+Thread.currentThread().getName());
        System.out.println("2. "+Thread.currentThread().getName());
        System.out.println("3. "+Thread.currentThread().getName());
    }
}
