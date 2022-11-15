package Shild.Glava_16;
//Продемонстрировать пременение методов equals()
// и equalsIgnoreCase()
public class equalsDemo {
    public static void main(String[] args){
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Прощай";
        String s4 ="ПРИВЕТ";
        System.out.println(s1+" равно "+s2+" -> "+s1.equals(s2) );
        System.out.println(s1+ " равно "+s2+" -> "+ s1.equals(s3));
        System.out.println(s1+ " равно "+s3+" -> "+ s1.equals(s4) );
        System.out.println(s4 + " равно "+s1+" -> "+s4.equalsIgnoreCase(s1));
    }
}
