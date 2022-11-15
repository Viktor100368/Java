package Shild.Glava_11;

public  class Mythread implements Runnable {
    String name;
    Thread t;

    Mythread(String n) {
        name = n;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        System.out.println("Мы находимся в потоке: " + name);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " считает " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
        System.out.println(name + " закончил");
    }
}
     class MythreadDemo {
        public static void main(String[] args) {
            new Mythread("Первый");

            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Главный считает: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
            System.out.println("Главный зокончил");
        }
    }

