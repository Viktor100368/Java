package Shild.Glava_11;
class MyThreadClass extends Thread{

    MyThreadClass(String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println("Это новый поток "+this);
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(super.getName() + " говорит " + i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){}
        System.out.println(super.getName()+ " закончил");
    }

}
public class MyThreadClassDemo {
    public static void main(String[] args) {
        new MyThreadClass("порожденный");
        for (int i=0;i<12;i++){
            System.out.println("Главный говорит "+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException E){}

        }
        System.out.println("Главный тоже сдох");
    }
}
