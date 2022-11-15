package Shild.Glava_12;
//Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple1 {
    Jonathan(10),ColdenDel(9),RedDel,Winesap(15),Cortland(8);
    private int price; //цена яблока каждого сорта
    //Конструктор
    Apple1(int p){price = p;}
     public int getPrice(){return price;}
     Apple1(){price=-1;}
}
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        //Вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит "+
                Apple1.Winesap.getPrice()+" центов.\n");
        //Вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок: ");
        for(Apple1 a: Apple1.values()) {
            if(a.getPrice()==-1)
                System.out.println(a+" нет в продаже");
            else 
            System.out.println(a + " стоит " + a.getPrice() + " центов");
        }
    }
}
