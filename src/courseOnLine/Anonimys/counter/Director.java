package courseOnLine.Anonimys.counter;

public class Director {
    public void force(Countable counter,int month){
        String str =counter.report(month);
        System.out.println(str);
    }
}
