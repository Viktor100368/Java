package courseOnLine.Anonimys.counter;
interface Cookerable{
    String cook(int n,String s);
}
class Directrisa{
    void force(Cookerable cooker,int sosiska,String ss ){
     String str="Повар я хочу жрать";
         str += cooker.cook(sosiska,ss);
        System.out.println(str);
    }
}
public class CookerDemo {
    public static void main(String[] args){
        Directrisa directrisa = new Directrisa();
        directrisa.force(new Cookerable() {
            @Override
            public String cook(int n, String s) {
                return " Уже готовлю "+ n+" "+s;
            }
        },2,"Сосиски");
    }

}
