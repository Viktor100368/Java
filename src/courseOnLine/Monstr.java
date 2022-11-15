package courseOnLine;

public class Monstr {
    int eye;
    int hand;
    int foot;
    Monstr(){
        eye=2;
        hand = 2;
        foot = 2;
    }
    Monstr(int eye){
        this.eye =eye;
        hand= 2;
        foot=2;
    }
    Monstr(int eye,int hand){
        this.eye = eye;
        this.hand =hand;
        foot = 2;
    }
    Monstr(int eye,int hand, int foot){
        this.eye=eye;
        this.hand=hand;
        this.foot=foot;
    }
    void voice(){
        System.out.println("eye= "+this.eye+" hand "+this.hand+" foot "+this.foot);
        System.out.println("Голос");

    }
    void voice(int i){
        System.out.println("eye= "+this.eye+" hand "+this.hand+" foot "+this.foot);
        for(int j=0;j<i;j++)
            System.out.println("Голос");
    }
    void voice(int i,String str){
        System.out.println("eye= "+this.eye+" hand "+this.hand+" foot "+this.foot);
        for(int j=0;j<i;j++){
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        Monstr monstr = new Monstr();
        Monstr monstr1 = new Monstr(3);
        Monstr monstr2 = new Monstr(3,4);
        Monstr monstr3 = new Monstr(12,5,3);
        monstr2.voice(4);

    }
}
