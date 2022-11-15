package Shild.Glava_16;
//Замена подстроки
public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        String str="";
        do {//заменить все совпадающие подстроки
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                System.out.println("i = "+i);
                result = org.substring(0, i);
                System.out.println(result);
                result = result + sub;
                System.out.println(result);
                str=org.substring(i + search.length());
                System.out.println("str: "+str);
                result = result + str;

                org = result;
            }
        } while (i != -1);
    }
}
