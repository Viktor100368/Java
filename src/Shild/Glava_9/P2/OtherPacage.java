package Shild.Glava_9.P2;

import Shild.Glava_9.P1.Protection;

class OtherPacage {
    OtherPacage(){
        Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");
        //доступно только для данного класса или пакета
        //System.out.println("n = "+p.n);
        //доступно только для данного класса
        //System.out.println("n_pri = "+p.n_pri);
        //доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = "+p.n_pro);
        System.out.println("n_pub = "+p.n_pub);
    }
}
