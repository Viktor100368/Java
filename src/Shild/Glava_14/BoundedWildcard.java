package Shild.Glava_14;
//Ограниченые метасимвольные аргументы

//Двумерные координаты
class TwoD{
    int x,y;

    TwoD(int a,int b){
        x=a;
        y=b;
    }
}
//Трехмерные координатц
class ThreedD extends TwoD{
    int z;
    ThreedD(int a,int b,int c){
        super(a,b);
        z=c;
    }
}
//Четырехмерные координаты
class FourD extends ThreedD{
    int t;
    FourD(int a,int b, int c,int d){
        super(a,b,c);
        t=d;
    }
}
//Этот класс хранит массив координатных объектов
class Coords<T extends  TwoD>{
    T[] coords;
    Coords(T[] o){coords = o;}
}
//Продемонстрировать применение ограниченых метасимволов
public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("Координаты X Y: ");
        for(int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreedD> c){
        System.out.println("Координаты X Y Z: ");
        for(int i= 0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+
                    c.coords[i].y+" "+
                    c.coords[i].z);
        System.out.println();
    }
    static void showAll(Coords<? extends FourD> c){
        System.out.println("Координаты X Y Z T:");
        for(int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+
                    c.coords[i].y+" "+
                    c.coords[i].z+" "+
                    c.coords[i].t);
        System.out.println();
    }
    public static void main(String[] args){
        TwoD[] td = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23)
        };
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Содержимое объекта tdlocs.");
        showXY(tdlocs);//Верно, это тип TwoD
        //showXYZ(tdlocs);//Ошибка, это не тип ThreedD
        //showAll(tdlocs);//Ошибка, это не тип FourD
        //а теперь создать несколько объектов типа FourD
        FourD fd[]={
                new FourD(1,2,3,4),
                new FourD(6,8,14,8),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("Содержимое объекта fdlocs");
        //Здесь все верно
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
