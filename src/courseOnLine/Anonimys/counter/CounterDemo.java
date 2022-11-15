package courseOnLine.Anonimys.counter;

public class CounterDemo {
    public static void main(String[] args){
        Director director = new Director();
        director.force(new Countable() {
            @Override
            public String report(int month) {
                return ( "Отчет за "+month+" месяцев");
            }
        },12);
    }
}
