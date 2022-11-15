package courseOnLine.OOP;
class Monstr{
    int ee;
    int foot;
    int hand;
    Monstr(){
        ee=2;
        foot=2;
        hand=2;
    }
    Monstr(int ee){
        this.ee=ee;
        foot=2;
        hand=2;
    }
    Monstr(int ee,int foot){
        this.foot=foot;
        this.ee=ee;
        hand=2;
    }
    Monstr(int ee,int foot,int hand){
        this.hand=hand;
        this.foot=foot;
        this.ee=ee;
    }
    void voice(){
        System.out.println("Голос");
    }
    void voice(int i){

        for(int k=0;k<i;k++)
            System.out.print("Голос ");
    }
    void voice(int i,String word){
        System.out.println();
        for(int k=0;k<i;k++)
            System.out.print(word+" ");
    }
    void showMonstr(){
        System.out.println( "ee= "+ee+" hand= "+hand+" foot= "+foot);
    }
}
public class MonstrDemo {
    public static void main(String[] args){
        Monstr ms= new Monstr();
        Monstr ms1=new Monstr(5);
        Monstr ms2 = new Monstr(4,3);
        Monstr ms3 = new Monstr(1,4,8);
        ms.showMonstr();
        ms1.showMonstr();
        ms2.showMonstr();
        ms3.showMonstr();
        ms.voice();
        ms.voice(8);
        ms.voice(5,"Hello");
    }
}
