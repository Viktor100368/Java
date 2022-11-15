package Zadachi;

import static java.lang.System.exit;

public class Recurcion {
        static int i;
        String a;
        Recurcion(String a,int b){
            this.a=a;
            i=b;
        }
    public void shwap() {

        System.out.print(a.charAt(i--));
        if (i < 0) return;
        shwap();

    }

    public static void main(String[] args) {
        String str = "Hello World";
        Recurcion rec = new Recurcion(str,str.length()-1);
        rec.shwap();
    }
}
