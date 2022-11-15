package Shild.Glava_9;

public class Client implements CallBack {

    public void callback(int p){
        System.out.println("Метод Callback(), вызываемый со значением "+p);
    }
    public void meth(){
        System.out.println("Теперь выведем другую хрень");
    }

}
