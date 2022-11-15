package courseOnLine.Anonimys;

public class ButtonIFDemo {
    public static void main(String[] args){
        Button1 btn = new Button1(new EventHandler(){
            @Override
            public void execute(){
                System.out.println("Копирование данных");
            }
        });

            btn.click();
    }
}
interface EventHandler{
    void execute();
}
class Button1{
    EventHandler handler;

    Button1(EventHandler handler){
        this.handler = handler;
    }
    public void click(){
        handler.execute();
    }
}
