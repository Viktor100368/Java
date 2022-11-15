package Shild.Glava_12;
enum Apple{
    Jonathan,GoldenDel,RedDel,Winesap,Cortland
}
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println("Константы перечислимого типа Apple1: ");
        // применить метод values()

        for(Apple1 a: Apple1.values())
            System.out.println(a);
        System.out.println();
        //Применить метод valueOf()
        ap = Apple1.valueOf("Winesap");
        System.out.println("Переменная ар содержит "+ap);
    }
}
