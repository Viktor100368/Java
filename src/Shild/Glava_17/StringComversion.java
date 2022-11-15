package Shild.Glava_17;
/*
Преобразовать целое число в двоичную, шестнадцатеричную
и восьмеричную строковую форму
 */
public class StringComversion {
    public static void main(String[] args){
        int num = 19648;
        System.out.println("Число "+num+" в двоичной форме: "+
                Integer.toBinaryString(num));
        System.out.println("Число "+num+" в восьмиричной форме: "+
                Integer.toOctalString(num));
        System.out.println("Число "+num+" в шестнадцатиричной форме: "+
                Integer.toHexString(num));
    }
}
