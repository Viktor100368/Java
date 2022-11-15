package courseOnLine.Anonimys;

public class Main {
    public static void main(String[] args){
       Button btnCopy = new Button(){
            @Override
            public void click() {
                System.out.println("Копирование данных");
            }
            public void doSome(){
                System.out.println("Do someting...");
            }

        };
        btnCopy.doSome();
        btnCopy.click();

    }
}
class Button{
    public void click(){
        System.out.println("Нажатие на кнопку");
    }
    public void doSome(){
        System.out.println("do Someting...");
    }
}
